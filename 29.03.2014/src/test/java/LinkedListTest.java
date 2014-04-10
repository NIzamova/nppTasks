import junit.framework.Assert;
import org.junit.Before;
import junit.framework.TestCase;
/**
 * Created by N on 10.04.14.
 */
public class LinkedListTest extends TestCase{

   // import sun.jvm.hotspot.utilities.Assert;


        private LinkedList<Integer> List;

        @Before
        public void setUp() {this.List = new LinkedList<Integer>(1);}

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
    }


