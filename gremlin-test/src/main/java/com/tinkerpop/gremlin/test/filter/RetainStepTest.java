package com.tinkerpop.gremlin.test.filter;

import com.tinkerpop.blueprints.pgm.Vertex;
import com.tinkerpop.pipes.Pipe;
import junit.framework.TestCase;

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */
public class RetainStepTest extends TestCase {

    public void testCompliance() {
        assertTrue(true);
    }

    public void test_g_v1_out_retainXg_v2X(Pipe<Vertex, Vertex> pipe) {
        assertEquals(pipe.next().getProperty("name"), "vadas");
        assertFalse(pipe.hasNext());
    }

    public void test_g_v1_out_aggregateXxX_out_retainXxX(Pipe<Vertex, Vertex> pipe) {
        assertEquals(pipe.next().getProperty("name"), "lop");
        assertFalse(pipe.hasNext());
    }
}