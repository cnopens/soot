package soot.jimple.paddle.queue;

import soot.util.*;
import soot.jimple.paddle.bdddomains.*;
import soot.jimple.paddle.*;
import soot.jimple.toolkits.callgraph.*;
import soot.*;
import soot.util.queue.*;
import jedd.*;
import java.util.*;

public final class Qctxt_local_obj_srcm_stmt_kind_tgtmBDD extends Qctxt_local_obj_srcm_stmt_kind_tgtm {
    private LinkedList readers = new LinkedList();
    
    public void add(Context _ctxt,
                    Local _local,
                    AllocNode _obj,
                    SootMethod _srcm,
                    Unit _stmt,
                    Kind _kind,
                    SootMethod _tgtm) {
        add(new jedd.internal.RelationContainer(new Attribute[] { ctxt.v(), local.v(), obj.v(), srcm.v(), stmt.v(), kind.v(), tgtm.v() },
                                                new PhysicalDomain[] { V2.v(), V1.v(), H1.v(), T1.v(), ST.v(), FD.v(), T2.v() },
                                                ("add(jedd.internal.Jedd.v().literal(new java.lang.Object[...]" +
                                                 ", new jedd.Attribute[...], new jedd.PhysicalDomain[...])) at" +
                                                 " /home/olhotak/soot-2-jedd/src/soot/jimple/paddle/queue/Qctx" +
                                                 "t_local_obj_srcm_stmt_kind_tgtmBDD.jedd:33,8-11"),
                                                jedd.internal.Jedd.v().literal(new Object[] { _ctxt, _local, _obj, _srcm, _stmt, _kind, _tgtm },
                                                                               new Attribute[] { ctxt.v(), local.v(), obj.v(), srcm.v(), stmt.v(), kind.v(), tgtm.v() },
                                                                               new PhysicalDomain[] { V2.v(), V1.v(), H1.v(), T1.v(), ST.v(), FD.v(), T2.v() })));
    }
    
    public void add(final jedd.internal.RelationContainer in) {
        for (Iterator it = readers.iterator(); it.hasNext(); ) {
            Rctxt_local_obj_srcm_stmt_kind_tgtmBDD reader = (Rctxt_local_obj_srcm_stmt_kind_tgtmBDD) it.next();
            reader.add(new jedd.internal.RelationContainer(new Attribute[] { obj.v(), tgtm.v(), srcm.v(), local.v(), kind.v(), stmt.v(), ctxt.v() },
                                                           new PhysicalDomain[] { H1.v(), T2.v(), T1.v(), V1.v(), FD.v(), ST.v(), V2.v() },
                                                           ("reader.add(in) at /home/olhotak/soot-2-jedd/src/soot/jimple/" +
                                                            "paddle/queue/Qctxt_local_obj_srcm_stmt_kind_tgtmBDD.jedd:38," +
                                                            "12-18"),
                                                           in));
        }
    }
    
    public Rctxt_local_obj_srcm_stmt_kind_tgtm reader() {
        Rctxt_local_obj_srcm_stmt_kind_tgtm ret = new Rctxt_local_obj_srcm_stmt_kind_tgtmBDD();
        readers.add(ret);
        return ret;
    }
    
    public Qctxt_local_obj_srcm_stmt_kind_tgtmBDD() { super(); }
}