// HeapDumpExample.java

import com.sun.management.HotSpotDiagnosticMXBean;
import java.lang.management.ManagementFactory;

public class HeapDumpExample {
    public static void main(String[] args) throws Exception {
        HotSpotDiagnosticMXBean mxBean = ManagementFactory.getPlatformMXBean(HotSpotDiagnosticMXBean.class);
        mxBean.dumpHeap("heapdump.hprof", true);
        System.out.println("Heap dump created!");
    }
}
