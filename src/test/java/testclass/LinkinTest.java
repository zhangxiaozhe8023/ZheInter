package testclass;


import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Test;

public class LinkinTest
{

    @Test
    public void test() throws Exception
    {
        Assert.assertThat("LinkinPark", isLinkinStr());
    }

    public Matcher<String> isLinkinStr()
    {
        return new BaseMatcher<String>()
        {


            public boolean matches(Object item)
            {
                if (!(item instanceof String))
                {
                    return false;
                }
                return ((String) item).contains("Linkin");
            }

            public void describeTo(Description description)
            {
                description.appendText("字符串必须包含Linkin这个单词。。。");
            }

        };
    }

}
