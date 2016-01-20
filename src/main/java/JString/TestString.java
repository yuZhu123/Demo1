package JString;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * Created by Administrator on 2016/1/19.
 */
public class TestString {

    @Test
    public void test1() throws NoSuchFieldException, IllegalAccessException {
        String m="hello,world";
        String n="hello,world";
        String u=new String(m);
        String v=new String("hello,world");
        Field f=m.getClass().getDeclaredField("value");
        f.setAccessible(true);
        char[] cs= (char[]) f.get(m);
        cs[0]='H';
        String p="Hello,world";
        Assert.assertEquals(p,m);
        Assert.assertEquals(p,n);
        Assert.assertEquals(p,u);
        Assert.assertEquals(p,v);
    }


}
