.class public abstract Lo0/S;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LD/H;

.field public static final b:LD/M0;

.field public static final c:LD/M0;

.field public static final d:LD/M0;

.field public static final e:LD/M0;

.field public static final f:LD/M0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Lo0/L;->f:Lo0/L;

    sget-object v1, LD/U;->i:LD/U;

    new-instance v2, LD/H;

    invoke-direct {v2, v1, v0}, LD/H;-><init>(LD/H0;Lo2/a;)V

    sput-object v2, Lo0/S;->a:LD/H;

    sget-object v0, Lo0/L;->g:Lo0/L;

    new-instance v1, LD/M0;

    invoke-direct {v1, v0}, LD/k0;-><init>(Lo2/a;)V

    sput-object v1, Lo0/S;->b:LD/M0;

    sget-object v0, Lo0/L;->h:Lo0/L;

    new-instance v1, LD/M0;

    invoke-direct {v1, v0}, LD/k0;-><init>(Lo2/a;)V

    sput-object v1, Lo0/S;->c:LD/M0;

    sget-object v0, Lo0/L;->i:Lo0/L;

    new-instance v1, LD/M0;

    invoke-direct {v1, v0}, LD/k0;-><init>(Lo2/a;)V

    sput-object v1, Lo0/S;->d:LD/M0;

    sget-object v0, Lo0/L;->j:Lo0/L;

    new-instance v1, LD/M0;

    invoke-direct {v1, v0}, LD/k0;-><init>(Lo2/a;)V

    sput-object v1, Lo0/S;->e:LD/M0;

    sget-object v0, Lo0/L;->k:Lo0/L;

    new-instance v1, LD/M0;

    invoke-direct {v1, v0}, LD/k0;-><init>(Lo2/a;)V

    sput-object v1, Lo0/S;->f:LD/M0;

    return-void
.end method

.method public static final a(Lo0/u;LL/a;LD/n;I)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    const/16 v5, 0x10

    const v6, 0x5342453c

    invoke-virtual {v2, v6}, LD/n;->O(I)LD/n;

    const/4 v6, 0x6

    and-int/lit8 v7, v3, 0x6

    if-nez v7, :cond_1

    invoke-virtual {v2, v0}, LD/n;->h(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v3

    goto :goto_1

    :cond_1
    move v7, v3

    :goto_1
    and-int/lit8 v8, v3, 0x30

    if-nez v8, :cond_3

    invoke-virtual {v2, v1}, LD/n;->h(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0x20

    goto :goto_2

    :cond_2
    move v8, v5

    :goto_2
    or-int/2addr v7, v8

    :cond_3
    and-int/lit8 v7, v7, 0x13

    const/16 v8, 0x12

    if-ne v7, v8, :cond_5

    invoke-virtual/range {p2 .. p2}, LD/n;->y()Z

    move-result v7

    if-nez v7, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual/range {p2 .. p2}, LD/n;->K()V

    goto/16 :goto_7

    :cond_5
    :goto_3
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-virtual/range {p2 .. p2}, LD/n;->H()Ljava/lang/Object;

    move-result-object v8

    sget-object v9, LD/l;->a:LD/U;

    if-ne v8, v9, :cond_6

    new-instance v8, Landroid/content/res/Configuration;

    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v10

    invoke-direct {v8, v10}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    invoke-static {v8}, LD/d;->A(Ljava/lang/Object;)LD/f0;

    move-result-object v8

    invoke-virtual {v2, v8}, LD/n;->V(Ljava/lang/Object;)V

    :cond_6
    check-cast v8, LD/Z;

    invoke-virtual/range {p2 .. p2}, LD/n;->H()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v9, :cond_7

    new-instance v10, LD/y;

    invoke-direct {v10, v5, v8}, LD/y;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v2, v10}, LD/n;->V(Ljava/lang/Object;)V

    :cond_7
    check-cast v10, Lo2/c;

    invoke-virtual {v0, v10}, Lo0/u;->setConfigurationChangeObserver(Lo2/c;)V

    invoke-virtual/range {p2 .. p2}, LD/n;->H()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v9, :cond_8

    new-instance v5, Lo0/X;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v2, v5}, LD/n;->V(Ljava/lang/Object;)V

    :cond_8
    check-cast v5, Lo0/X;

    invoke-virtual/range {p0 .. p0}, Lo0/u;->getViewTreeOwners()Lo0/l;

    move-result-object v10

    if-eqz v10, :cond_1a

    invoke-virtual/range {p2 .. p2}, LD/n;->H()Ljava/lang/Object;

    move-result-object v11

    iget-object v12, v10, Lo0/l;->b:LA1/g;

    if-ne v11, v9, :cond_c

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v11

    const-string v13, "null cannot be cast to non-null type android.view.View"

    invoke-static {v11, v13}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Landroid/view/View;

    const v13, 0x7f08006b

    invoke-virtual {v11, v13}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v13

    instance-of v14, v13, Ljava/lang/String;

    const/4 v15, 0x0

    if-eqz v14, :cond_9

    check-cast v13, Ljava/lang/String;

    goto :goto_4

    :cond_9
    move-object v13, v15

    :goto_4
    if-nez v13, :cond_a

    invoke-virtual {v11}, Landroid/view/View;->getId()I

    move-result v11

    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v13

    :cond_a
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-class v14, LM/b;

    invoke-virtual {v14}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v14, 0x3a

    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v12}, LA1/g;->b()LA1/e;

    move-result-object v13

    invoke-virtual {v13, v11}, LA1/e;->a(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v14

    if-eqz v14, :cond_b

    new-instance v15, Ljava/util/LinkedHashMap;

    invoke-direct {v15}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v14}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v16

    check-cast v16, Ljava/lang/Iterable;

    invoke-interface/range {v16 .. v16}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_5
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_b

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v6, v17

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v14, v6}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    move-object/from16 v19, v14

    const-string v14, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }"

    invoke-static {v4, v14}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v15, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v14, v19

    const/4 v6, 0x6

    goto :goto_5

    :cond_b
    sget-object v4, LM/e;->a:LD/M0;

    new-instance v4, LM/c;

    invoke-direct {v4, v15}, LM/c;-><init>(Ljava/util/LinkedHashMap;)V

    :try_start_0
    new-instance v6, Lb/d;

    const/4 v14, 0x1

    invoke-direct {v6, v14, v4}, Lb/d;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v13, v11, v6}, LA1/e;->b(Ljava/lang/String;LA1/d;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_6

    :catch_0
    const/4 v6, 0x0

    move v14, v6

    :goto_6
    new-instance v6, Lo0/h0;

    new-instance v15, Lo0/i0;

    invoke-direct {v15, v14, v13, v11}, Lo0/i0;-><init>(ZLA1/e;Ljava/lang/String;)V

    invoke-direct {v6, v4, v15}, Lo0/h0;-><init>(LM/c;Lo0/i0;)V

    invoke-virtual {v2, v6}, LD/n;->V(Ljava/lang/Object;)V

    move-object v11, v6

    :cond_c
    check-cast v11, Lo0/h0;

    sget-object v4, Lc2/m;->a:Lc2/m;

    invoke-virtual {v2, v11}, LD/n;->h(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual/range {p2 .. p2}, LD/n;->H()Ljava/lang/Object;

    move-result-object v13

    if-nez v6, :cond_d

    if-ne v13, v9, :cond_e

    :cond_d
    new-instance v13, LD/y;

    const/16 v6, 0x11

    invoke-direct {v13, v6, v11}, LD/y;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v2, v13}, LD/n;->V(Ljava/lang/Object;)V

    :cond_e
    check-cast v13, Lo2/c;

    invoke-static {v4, v13, v2}, LD/d;->c(Ljava/lang/Object;Lo2/c;LD/n;)V

    invoke-interface {v8}, LD/L0;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/res/Configuration;

    invoke-virtual/range {p2 .. p2}, LD/n;->H()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v9, :cond_f

    new-instance v6, Lr0/c;

    invoke-direct {v6}, Lr0/c;-><init>()V

    invoke-virtual {v2, v6}, LD/n;->V(Ljava/lang/Object;)V

    :cond_f
    check-cast v6, Lr0/c;

    invoke-virtual/range {p2 .. p2}, LD/n;->H()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v9, :cond_11

    new-instance v13, Landroid/content/res/Configuration;

    invoke-direct {v13}, Landroid/content/res/Configuration;-><init>()V

    if-eqz v4, :cond_10

    invoke-virtual {v13, v4}, Landroid/content/res/Configuration;->setTo(Landroid/content/res/Configuration;)V

    :cond_10
    invoke-virtual {v2, v13}, LD/n;->V(Ljava/lang/Object;)V

    :cond_11
    check-cast v13, Landroid/content/res/Configuration;

    invoke-virtual/range {p2 .. p2}, LD/n;->H()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v9, :cond_12

    new-instance v4, Lo0/P;

    invoke-direct {v4, v13, v6}, Lo0/P;-><init>(Landroid/content/res/Configuration;Lr0/c;)V

    invoke-virtual {v2, v4}, LD/n;->V(Ljava/lang/Object;)V

    :cond_12
    check-cast v4, Lo0/P;

    invoke-virtual {v2, v7}, LD/n;->h(Ljava/lang/Object;)Z

    move-result v13

    invoke-virtual/range {p2 .. p2}, LD/n;->H()Ljava/lang/Object;

    move-result-object v14

    if-nez v13, :cond_13

    if-ne v14, v9, :cond_14

    :cond_13
    new-instance v14, LD/g;

    const/4 v13, 0x5

    invoke-direct {v14, v7, v13, v4}, LD/g;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v2, v14}, LD/n;->V(Ljava/lang/Object;)V

    :cond_14
    check-cast v14, Lo2/c;

    invoke-static {v6, v14, v2}, LD/d;->c(Ljava/lang/Object;Lo2/c;LD/n;)V

    invoke-virtual/range {p2 .. p2}, LD/n;->H()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v9, :cond_15

    new-instance v4, Lr0/d;

    invoke-direct {v4}, Lr0/d;-><init>()V

    invoke-virtual {v2, v4}, LD/n;->V(Ljava/lang/Object;)V

    :cond_15
    check-cast v4, Lr0/d;

    invoke-virtual/range {p2 .. p2}, LD/n;->H()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v9, :cond_16

    new-instance v13, Lo0/Q;

    invoke-direct {v13, v4}, Lo0/Q;-><init>(Lr0/d;)V

    invoke-virtual {v2, v13}, LD/n;->V(Ljava/lang/Object;)V

    :cond_16
    check-cast v13, Lo0/Q;

    invoke-virtual {v2, v7}, LD/n;->h(Ljava/lang/Object;)Z

    move-result v14

    invoke-virtual/range {p2 .. p2}, LD/n;->H()Ljava/lang/Object;

    move-result-object v15

    if-nez v14, :cond_17

    if-ne v15, v9, :cond_18

    :cond_17
    new-instance v15, LD/g;

    const/4 v9, 0x6

    invoke-direct {v15, v7, v9, v13}, LD/g;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v2, v15}, LD/n;->V(Ljava/lang/Object;)V

    :cond_18
    check-cast v15, Lo2/c;

    invoke-static {v4, v15, v2}, LD/d;->c(Ljava/lang/Object;Lo2/c;LD/n;)V

    sget-object v9, Lo0/f0;->t:LD/H;

    invoke-virtual {v2, v9}, LD/n;->k(LD/k0;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Boolean;

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    invoke-virtual/range {p0 .. p0}, Lo0/u;->getScrollCaptureInProgress$ui_release()Z

    move-result v14

    or-int/2addr v13, v14

    invoke-interface {v8}, LD/L0;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/content/res/Configuration;

    sget-object v14, Lo0/S;->a:LD/H;

    invoke-virtual {v14, v8}, LD/H;->a(Ljava/lang/Object;)LD/l0;

    move-result-object v15

    sget-object v8, Lo0/S;->b:LD/M0;

    invoke-virtual {v8, v7}, LD/M0;->a(Ljava/lang/Object;)LD/l0;

    move-result-object v16

    sget-object v7, Lu1/b;->a:LD/k0;

    iget-object v8, v10, Lo0/l;->a:Landroidx/lifecycle/r;

    invoke-virtual {v7, v8}, LD/k0;->a(Ljava/lang/Object;)LD/l0;

    move-result-object v17

    sget-object v7, Lo0/S;->e:LD/M0;

    invoke-virtual {v7, v12}, LD/M0;->a(Ljava/lang/Object;)LD/l0;

    move-result-object v18

    sget-object v7, LM/e;->a:LD/M0;

    invoke-virtual {v7, v11}, LD/M0;->a(Ljava/lang/Object;)LD/l0;

    move-result-object v19

    invoke-virtual/range {p0 .. p0}, Lo0/u;->getView()Landroid/view/View;

    move-result-object v7

    sget-object v8, Lo0/S;->f:LD/M0;

    invoke-virtual {v8, v7}, LD/M0;->a(Ljava/lang/Object;)LD/l0;

    move-result-object v20

    sget-object v7, Lo0/S;->c:LD/M0;

    invoke-virtual {v7, v6}, LD/M0;->a(Ljava/lang/Object;)LD/l0;

    move-result-object v21

    sget-object v6, Lo0/S;->d:LD/M0;

    invoke-virtual {v6, v4}, LD/M0;->a(Ljava/lang/Object;)LD/l0;

    move-result-object v22

    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v9, v4}, LD/H;->a(Ljava/lang/Object;)LD/l0;

    move-result-object v23

    filled-new-array/range {v15 .. v23}, [LD/l0;

    move-result-object v4

    new-instance v6, Lo0/N;

    invoke-direct {v6, v0, v5, v1}, Lo0/N;-><init>(Lo0/u;Lo0/X;LL/a;)V

    const v5, 0x57b729fc

    invoke-static {v5, v6, v2}, LL/b;->b(ILp2/h;LD/n;)LL/a;

    move-result-object v5

    const/16 v6, 0x38

    invoke-static {v4, v5, v2, v6}, LD/d;->b([LD/l0;LL/a;LD/n;I)V

    :goto_7
    invoke-virtual/range {p2 .. p2}, LD/n;->s()LD/n0;

    move-result-object v2

    if-eqz v2, :cond_19

    new-instance v4, LD/u;

    const/4 v5, 0x3

    invoke-direct {v4, v0, v1, v3, v5}, LD/u;-><init>(Ljava/lang/Object;LL/a;II)V

    iput-object v4, v2, LD/n0;->d:Lo2/e;

    :cond_19
    return-void

    :cond_1a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Called when the ViewTreeOwnersAvailability is not yet in Available state"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final b(Ljava/lang/String;)V
    .locals 3

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "CompositionLocal "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " not present"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
