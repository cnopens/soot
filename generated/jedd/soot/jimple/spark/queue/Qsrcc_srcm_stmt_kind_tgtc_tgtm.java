package soot.jimple.spark.queue;

import soot.util.*;
import soot.jimple.spark.bdddomains.*;
import soot.jimple.spark.*;
import soot.jimple.toolkits.callgraph.*;
import soot.*;
import soot.util.queue.*;
import jedd.*;
import java.util.*;

public abstract class Qsrcc_srcm_stmt_kind_tgtc_tgtm {
    public abstract void add(Context _srcc, SootMethod _srcm, Unit _stmt, Kind _kind, Context _tgtc, SootMethod _tgtm);
    
    public abstract void add(final jedd.internal.RelationContainer in);
    
    public abstract Rsrcc_srcm_stmt_kind_tgtc_tgtm reader();
    
    public Qsrcc_srcm_stmt_kind_tgtc_tgtm() { super(); }
}