//import sun.jvm.hotspot.utilities.Assert;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by N on 10.04.14.
 */
public class StackTest {

        private LinkedList<Integer> List;

        @Before
        public void setUp() {this.List = new LinkedList<Integer>(1);
        }

        @org.junit.Test
        public void testAdd() throws Exception {
            List.add(2);
            Assert.assertEquals(List.peek().intValue(),2 );

        }

        @org.junit.Test
        public void testRemove() throws Exception {
            List.add(2);List.add(3);
            Assert.assertEquals(List.remove().intValue(),3);

        }

        @org.junit.Test
        public void testPeek() throws Exception {
            List.add(2); List.add(4);
            Assert.assertEquals(List.peek().intValue(),4);
        }

        @Test
        public void testSize() throws Exception{
            LinkedList<Integer> List2 = new LinkedList<Integer>(1);
            for(int i=0;i<6;i++)
                List2.add(i+2);
            this.List = List2;
            Assert.assertEquals(List.size(), List2.size());
    }
    
    }


