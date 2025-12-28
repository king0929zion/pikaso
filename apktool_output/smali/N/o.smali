.class public abstract LN/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LB0/a;

.field public static final b:Ljava/lang/Object;

.field public static c:LN/l;

.field public static d:I

.field public static final e:LM1/j;

.field public static final f:LN/w;

.field public static g:Ljava/lang/Object;

.field public static h:Ljava/lang/Object;

.field public static final i:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final j:LN/h;

.field public static final k:LD/e;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, LB0/a;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, LB0/a;-><init>(I)V

    sput-object v0, LN/o;->a:LB0/a;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LN/o;->b:Ljava/lang/Object;

    sget-object v0, LN/l;->h:LN/l;

    sput-object v0, LN/o;->c:LN/l;

    const/4 v1, 0x2

    sput v1, LN/o;->d:I

    new-instance v1, LM1/j;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/16 v2, 0x10

    new-array v3, v2, [I

    iput-object v3, v1, LM1/j;->b:Ljava/lang/Object;

    new-array v3, v2, [I

    iput-object v3, v1, LM1/j;->d:Ljava/lang/Object;

    new-array v3, v2, [I

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v2, :cond_0

    add-int/lit8 v6, v5, 0x1

    aput v6, v3, v5

    move v5, v6

    goto :goto_0

    :cond_0
    iput-object v3, v1, LM1/j;->e:Ljava/lang/Object;

    sput-object v1, LN/o;->e:LM1/j;

    new-instance v1, LN/w;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-array v3, v2, [I

    iput-object v3, v1, LN/w;->b:Ljava/lang/Object;

    new-array v2, v2, [LD/P0;

    iput-object v2, v1, LN/w;->c:Ljava/lang/Object;

    sput-object v1, LN/o;->f:LN/w;

    sget-object v1, Ld2/s;->d:Ld2/s;

    sput-object v1, LN/o;->g:Ljava/lang/Object;

    sput-object v1, LN/o;->h:Ljava/lang/Object;

    new-instance v1, LN/b;

    sget v2, LN/o;->d:I

    add-int/lit8 v3, v2, 0x1

    sput v3, LN/o;->d:I

    invoke-direct {v1, v2, v0}, LN/b;-><init>(ILN/l;)V

    sget-object v0, LN/o;->c:LN/l;

    iget v2, v1, LN/h;->b:I

    invoke-virtual {v0, v2}, LN/l;->e(I)LN/l;

    move-result-object v0

    sput-object v0, LN/o;->c:LN/l;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, LN/o;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LN/h;

    sput-object v0, LN/o;->j:LN/h;

    new-instance v0, LD/e;

    invoke-direct {v0, v4}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, LN/o;->k:LD/e;

    return-void
.end method

.method public static final a()V
    .locals 1

    sget-object v0, LN/m;->f:LN/m;

    invoke-static {v0}, LN/o;->f(Lo2/c;)Ljava/lang/Object;

    return-void
.end method

.method public static final b(Lo2/c;Lo2/c;)Lo2/c;
    .locals 2

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    if-eq p0, p1, :cond_0

    new-instance v0, LN/a;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p1, v1}, LN/a;-><init>(Lo2/c;Lo2/c;I)V

    move-object p0, v0

    goto :goto_0

    :cond_0
    if-nez p0, :cond_1

    move-object p0, p1

    :cond_1
    :goto_0
    return-object p0
.end method

.method public static final c(LN/c;LN/c;LN/l;)Ljava/util/HashMap;
    .locals 21

    invoke-virtual/range {p1 .. p1}, LN/c;->w()Ln/B;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, LN/h;->d()I

    move-result v1

    if-nez v0, :cond_1

    :cond_0
    const/4 v2, 0x0

    goto/16 :goto_7

    :cond_1
    invoke-virtual/range {p1 .. p1}, LN/h;->e()LN/l;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, LN/h;->d()I

    move-result v4

    invoke-virtual {v3, v4}, LN/l;->e(I)LN/l;

    move-result-object v3

    move-object/from16 v4, p1

    iget-object v5, v4, LN/c;->j:LN/l;

    invoke-virtual {v3, v5}, LN/l;->d(LN/l;)LN/l;

    move-result-object v3

    iget-object v5, v0, Ln/B;->b:[Ljava/lang/Object;

    iget-object v0, v0, Ln/B;->a:[J

    array-length v6, v0

    add-int/lit8 v6, v6, -0x2

    if-ltz v6, :cond_b

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_0
    aget-wide v10, v0, v8

    not-long v12, v10

    const/4 v14, 0x7

    shl-long/2addr v12, v14

    and-long/2addr v12, v10

    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v12, v14

    cmp-long v12, v12, v14

    if-eqz v12, :cond_9

    sub-int v12, v8, v6

    not-int v12, v12

    ushr-int/lit8 v12, v12, 0x1f

    const/16 v13, 0x8

    rsub-int/lit8 v12, v12, 0x8

    const/4 v14, 0x0

    :goto_1
    if-ge v14, v12, :cond_8

    const-wide/16 v15, 0xff

    and-long/2addr v15, v10

    const-wide/16 v17, 0x80

    cmp-long v15, v15, v17

    if-gez v15, :cond_7

    shl-int/lit8 v15, v8, 0x3

    add-int/2addr v15, v14

    aget-object v15, v5, v15

    check-cast v15, LN/y;

    invoke-interface {v15}, LN/y;->b()LN/A;

    move-result-object v7

    move-object/from16 v13, p2

    invoke-static {v7, v1, v13}, LN/o;->s(LN/A;ILN/l;)LN/A;

    move-result-object v2

    if-nez v2, :cond_2

    move-object/from16 v18, v0

    goto :goto_2

    :cond_2
    move-object/from16 v18, v0

    invoke-static {v7, v1, v3}, LN/o;->s(LN/A;ILN/l;)LN/A;

    move-result-object v0

    if-nez v0, :cond_4

    :cond_3
    :goto_2
    move/from16 v19, v1

    move-object/from16 v20, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v19

    if-nez v19, :cond_3

    move/from16 v19, v1

    invoke-virtual/range {p1 .. p1}, LN/h;->d()I

    move-result v1

    move-object/from16 v20, v3

    invoke-virtual/range {p1 .. p1}, LN/h;->e()LN/l;

    move-result-object v3

    invoke-static {v7, v1, v3}, LN/o;->s(LN/A;ILN/l;)LN/A;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-interface {v15, v0, v2, v1}, LN/y;->c(LN/A;LN/A;LN/A;)LN/A;

    move-result-object v0

    if-eqz v0, :cond_0

    if-nez v9, :cond_5

    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    :cond_5
    move-object v1, v9

    invoke-interface {v9, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v9, v1

    goto :goto_4

    :cond_6
    invoke-static {}, LN/o;->r()V

    const/4 v0, 0x0

    throw v0

    :goto_3
    const/16 v1, 0x8

    goto :goto_5

    :cond_7
    move-object/from16 v13, p2

    move-object/from16 v18, v0

    move/from16 v19, v1

    move-object/from16 v20, v3

    :goto_4
    const/4 v0, 0x0

    goto :goto_3

    :goto_5
    shr-long/2addr v10, v1

    add-int/lit8 v14, v14, 0x1

    move v13, v1

    move-object/from16 v0, v18

    move/from16 v1, v19

    move-object/from16 v3, v20

    goto :goto_1

    :cond_8
    move-object/from16 v18, v0

    move/from16 v19, v1

    move-object/from16 v20, v3

    move v1, v13

    const/4 v0, 0x0

    move-object/from16 v13, p2

    if-ne v12, v1, :cond_a

    goto :goto_6

    :cond_9
    move-object/from16 v13, p2

    move-object/from16 v18, v0

    move/from16 v19, v1

    move-object/from16 v20, v3

    const/4 v0, 0x0

    :goto_6
    if-eq v8, v6, :cond_a

    add-int/lit8 v8, v8, 0x1

    move-object/from16 v0, v18

    move/from16 v1, v19

    move-object/from16 v3, v20

    goto/16 :goto_0

    :cond_a
    move-object v2, v9

    goto :goto_7

    :cond_b
    const/4 v0, 0x0

    move-object v2, v0

    :goto_7
    return-object v2
.end method

.method public static final d(LN/h;)V
    .locals 3

    sget-object v0, LN/o;->c:LN/l;

    invoke-virtual {p0}, LN/h;->d()I

    move-result v1

    invoke-virtual {v0, v1}, LN/l;->c(I)Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Snapshot is not open: id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, LN/h;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", disposed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LN/h;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", applied="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    instance-of v1, p0, LN/c;

    if-eqz v1, :cond_0

    check-cast p0, LN/c;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    iget-boolean p0, p0, LN/c;->m:Z

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    goto :goto_1

    :cond_1
    const-string p0, "read-only"

    :goto_1
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ", lowestPin="

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p0, LN/o;->b:Ljava/lang/Object;

    monitor-enter p0

    :try_start_0
    sget-object v1, LN/o;->e:LM1/j;

    iget v2, v1, LM1/j;->a:I

    if-lez v2, :cond_2

    iget-object v1, v1, LM1/j;->b:Ljava/lang/Object;

    check-cast v1, [I

    const/4 v2, 0x0

    aget v1, v1, v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :cond_2
    const/4 v1, -0x1

    :goto_2
    monitor-exit p0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_3
    return-void
.end method

.method public static final e(LN/l;II)LN/l;
    .locals 0

    :goto_0
    if-ge p1, p2, :cond_0

    invoke-virtual {p0, p1}, LN/l;->e(I)LN/l;

    move-result-object p0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public static final f(Lo2/c;)Ljava/lang/Object;
    .locals 15

    sget-object v0, LN/o;->j:LN/h;

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot"

    invoke-static {v0, v1}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LN/b;

    sget-object v0, LN/o;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, LN/o;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LN/b;

    iget-object v2, v2, LN/c;->h:Ln/B;

    if-eqz v2, :cond_0

    sget-object v3, LN/o;->k:LD/e;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    goto :goto_0

    :catchall_0
    move-exception p0

    goto/16 :goto_8

    :cond_0
    :goto_0
    move-object v3, v1

    check-cast v3, LN/h;

    invoke-static {v3, p0}, LN/o;->v(LN/h;Lo2/c;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    const/4 v0, 0x0

    if-eqz v2, :cond_2

    const/4 v3, -0x1

    :try_start_1
    sget-object v4, LN/o;->g:Ljava/lang/Object;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    move v6, v0

    :goto_1
    if-ge v6, v5, :cond_1

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lo2/e;

    new-instance v8, LF/f;

    invoke-direct {v8, v2}, LF/f;-><init>(Ln/B;)V

    invoke-interface {v7, v8, v1}, Lo2/e;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :catchall_1
    move-exception p0

    goto :goto_2

    :cond_1
    sget-object v1, LN/o;->k:LD/e;

    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    goto :goto_3

    :goto_2
    sget-object v0, LN/o;->k:LD/e;

    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    throw p0

    :cond_2
    :goto_3
    sget-object v1, LN/o;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_2
    invoke-static {}, LN/o;->g()V

    if-eqz v2, :cond_6

    iget-object v3, v2, Ln/B;->b:[Ljava/lang/Object;

    iget-object v2, v2, Ln/B;->a:[J

    array-length v4, v2

    add-int/lit8 v4, v4, -0x2

    if-ltz v4, :cond_6

    move v5, v0

    :goto_4
    aget-wide v6, v2, v5

    not-long v8, v6

    const/4 v10, 0x7

    shl-long/2addr v8, v10

    and-long/2addr v8, v6

    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v8, v10

    cmp-long v8, v8, v10

    if-eqz v8, :cond_5

    sub-int v8, v5, v4

    not-int v8, v8

    ushr-int/lit8 v8, v8, 0x1f

    const/16 v9, 0x8

    rsub-int/lit8 v8, v8, 0x8

    move v10, v0

    :goto_5
    if-ge v10, v8, :cond_4

    const-wide/16 v11, 0xff

    and-long/2addr v11, v6

    const-wide/16 v13, 0x80

    cmp-long v11, v11, v13

    if-gez v11, :cond_3

    shl-int/lit8 v11, v5, 0x3

    add-int/2addr v11, v10

    aget-object v11, v3, v11

    check-cast v11, LN/y;

    invoke-static {v11}, LN/o;->q(LN/y;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_6

    :catchall_2
    move-exception p0

    goto :goto_7

    :cond_3
    :goto_6
    shr-long/2addr v6, v9

    add-int/lit8 v10, v10, 0x1

    goto :goto_5

    :cond_4
    if-ne v8, v9, :cond_6

    :cond_5
    if-eq v5, v4, :cond_6

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_6
    monitor-exit v1

    return-object p0

    :goto_7
    monitor-exit v1

    throw p0

    :goto_8
    monitor-exit v0

    throw p0
.end method

.method public static final g()V
    .locals 7

    sget-object v0, LN/o;->f:LN/w;

    iget v1, v0, LN/w;->a:I

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    const/4 v5, 0x0

    if-ge v3, v1, :cond_3

    iget-object v6, v0, LN/w;->c:Ljava/lang/Object;

    check-cast v6, [LD/P0;

    aget-object v6, v6, v3

    if-eqz v6, :cond_0

    invoke-virtual {v6}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v5

    :cond_0
    if-eqz v5, :cond_2

    check-cast v5, LN/y;

    invoke-static {v5}, LN/o;->p(LN/y;)Z

    move-result v5

    if-eqz v5, :cond_2

    if-eq v4, v3, :cond_1

    iget-object v5, v0, LN/w;->c:Ljava/lang/Object;

    check-cast v5, [LD/P0;

    aput-object v6, v5, v4

    iget-object v5, v0, LN/w;->b:Ljava/lang/Object;

    check-cast v5, [I

    aget v6, v5, v3

    aput v6, v5, v4

    :cond_1
    add-int/lit8 v4, v4, 0x1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    move v3, v4

    :goto_1
    if-ge v3, v1, :cond_4

    iget-object v6, v0, LN/w;->c:Ljava/lang/Object;

    check-cast v6, [LD/P0;

    aput-object v5, v6, v3

    iget-object v6, v0, LN/w;->b:Ljava/lang/Object;

    check-cast v6, [I

    aput v2, v6, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    if-eq v4, v1, :cond_5

    iput v4, v0, LN/w;->a:I

    :cond_5
    return-void
.end method

.method public static final h(LN/h;Lo2/c;Z)LN/h;
    .locals 8

    instance-of v0, p0, LN/c;

    if-nez v0, :cond_1

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, LN/E;

    invoke-direct {v0, p0, p1, p2}, LN/E;-><init>(LN/h;Lo2/c;Z)V

    goto :goto_3

    :cond_1
    :goto_0
    new-instance v7, LN/D;

    if-eqz v0, :cond_2

    check-cast p0, LN/c;

    :goto_1
    move-object v2, p0

    goto :goto_2

    :cond_2
    const/4 p0, 0x0

    goto :goto_1

    :goto_2
    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, v7

    move-object v3, p1

    move v6, p2

    invoke-direct/range {v1 .. v6}, LN/D;-><init>(LN/c;Lo2/c;Lo2/c;ZZ)V

    move-object v0, v7

    :goto_3
    return-object v0
.end method

.method public static final i(LN/A;)LN/A;
    .locals 3

    invoke-static {}, LN/o;->k()LN/h;

    move-result-object v0

    invoke-virtual {v0}, LN/h;->d()I

    move-result v1

    invoke-virtual {v0}, LN/h;->e()LN/l;

    move-result-object v0

    invoke-static {p0, v1, v0}, LN/o;->s(LN/A;ILN/l;)LN/A;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object v0, LN/o;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {}, LN/o;->k()LN/h;

    move-result-object v1

    invoke-virtual {v1}, LN/h;->d()I

    move-result v2

    invoke-virtual {v1}, LN/h;->e()LN/l;

    move-result-object v1

    invoke-static {p0, v2, v1}, LN/o;->s(LN/A;ILN/l;)LN/A;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    if-eqz p0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    invoke-static {}, LN/o;->r()V

    const/4 p0, 0x0

    throw p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public static final j(LN/A;LN/h;)LN/A;
    .locals 1

    invoke-virtual {p1}, LN/h;->d()I

    move-result v0

    invoke-virtual {p1}, LN/h;->e()LN/l;

    move-result-object p1

    invoke-static {p0, v0, p1}, LN/o;->s(LN/A;ILN/l;)LN/A;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    invoke-static {}, LN/o;->r()V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final k()LN/h;
    .locals 1

    sget-object v0, LN/o;->a:LB0/a;

    invoke-virtual {v0}, LB0/a;->i()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LN/h;

    if-nez v0, :cond_0

    sget-object v0, LN/o;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LN/h;

    :cond_0
    return-object v0
.end method

.method public static final l(Lo2/c;Lo2/c;Z)Lo2/c;
    .locals 1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p0, :cond_1

    if-eqz p1, :cond_1

    if-eq p0, p1, :cond_1

    new-instance p2, LN/a;

    const/4 v0, 0x1

    invoke-direct {p2, p0, p1, v0}, LN/a;-><init>(Lo2/c;Lo2/c;I)V

    move-object p0, p2

    goto :goto_1

    :cond_1
    if-nez p0, :cond_2

    move-object p0, p1

    :cond_2
    :goto_1
    return-object p0
.end method

.method public static final m(LN/A;LN/y;)LN/A;
    .locals 6

    invoke-interface {p1}, LN/y;->b()LN/A;

    move-result-object v0

    sget v1, LN/o;->d:I

    sget-object v2, LN/o;->e:LM1/j;

    iget v3, v2, LM1/j;->a:I

    if-lez v3, :cond_0

    iget-object v1, v2, LM1/j;->b:Ljava/lang/Object;

    check-cast v1, [I

    const/4 v2, 0x0

    aget v1, v1, v2

    :cond_0
    add-int/lit8 v1, v1, -0x1

    sget-object v2, LN/l;->h:LN/l;

    const/4 v3, 0x0

    move-object v4, v3

    :goto_0
    if-eqz v0, :cond_5

    iget v5, v0, LN/A;->a:I

    if-nez v5, :cond_1

    :goto_1
    move-object v3, v0

    goto :goto_3

    :cond_1
    if-eqz v5, :cond_4

    if-gt v5, v1, :cond_4

    invoke-virtual {v2, v5}, LN/l;->c(I)Z

    move-result v5

    if-nez v5, :cond_4

    if-nez v4, :cond_2

    move-object v4, v0

    goto :goto_2

    :cond_2
    iget v1, v0, LN/A;->a:I

    iget v2, v4, LN/A;->a:I

    if-ge v1, v2, :cond_3

    goto :goto_1

    :cond_3
    move-object v3, v4

    goto :goto_3

    :cond_4
    :goto_2
    iget-object v0, v0, LN/A;->b:LN/A;

    goto :goto_0

    :cond_5
    :goto_3
    const v0, 0x7fffffff

    if-eqz v3, :cond_6

    iput v0, v3, LN/A;->a:I

    goto :goto_4

    :cond_6
    invoke-virtual {p0}, LN/A;->b()LN/A;

    move-result-object v3

    iput v0, v3, LN/A;->a:I

    invoke-interface {p1}, LN/y;->b()LN/A;

    move-result-object p0

    iput-object p0, v3, LN/A;->b:LN/A;

    invoke-interface {p1, v3}, LN/y;->a(LN/A;)V

    :goto_4
    return-object v3
.end method

.method public static final n(LN/h;LN/y;)V
    .locals 1

    invoke-virtual {p0}, LN/h;->h()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, LN/h;->s(I)V

    invoke-virtual {p0}, LN/h;->i()Lo2/c;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Lo2/c;->i(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public static final o(LN/A;LN/z;LN/h;LN/A;)LN/A;
    .locals 2

    invoke-virtual {p2}, LN/h;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2, p1}, LN/h;->n(LN/y;)V

    :cond_0
    invoke-virtual {p2}, LN/h;->d()I

    move-result v0

    iget v1, p3, LN/A;->a:I

    if-ne v1, v0, :cond_1

    return-object p3

    :cond_1
    sget-object v1, LN/o;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-static {p0, p1}, LN/o;->m(LN/A;LN/y;)LN/A;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    iput v0, p0, LN/A;->a:I

    iget p3, p3, LN/A;->a:I

    const/4 v0, 0x1

    if-eq p3, v0, :cond_2

    invoke-virtual {p2, p1}, LN/h;->n(LN/y;)V

    :cond_2
    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v1

    throw p0
.end method

.method public static final p(LN/y;)Z
    .locals 10

    invoke-interface {p0}, LN/y;->b()LN/A;

    move-result-object v0

    sget v1, LN/o;->d:I

    sget-object v2, LN/o;->e:LM1/j;

    iget v3, v2, LM1/j;->a:I

    const/4 v4, 0x0

    if-lez v3, :cond_0

    iget-object v1, v2, LM1/j;->b:Ljava/lang/Object;

    check-cast v1, [I

    aget v1, v1, v4

    :cond_0
    const/4 v2, 0x0

    move-object v3, v2

    move v5, v4

    :goto_0
    if-eqz v0, :cond_9

    iget v6, v0, LN/A;->a:I

    if-eqz v6, :cond_8

    if-ge v6, v1, :cond_7

    if-nez v2, :cond_1

    add-int/lit8 v5, v5, 0x1

    move-object v2, v0

    goto :goto_4

    :cond_1
    iget v7, v2, LN/A;->a:I

    if-ge v6, v7, :cond_2

    move-object v6, v2

    move-object v2, v0

    goto :goto_1

    :cond_2
    move-object v6, v0

    :goto_1
    if-nez v3, :cond_6

    invoke-interface {p0}, LN/y;->b()LN/A;

    move-result-object v3

    move-object v7, v3

    :goto_2
    if-eqz v3, :cond_5

    iget v8, v3, LN/A;->a:I

    if-lt v8, v1, :cond_3

    goto :goto_3

    :cond_3
    iget v9, v7, LN/A;->a:I

    if-ge v9, v8, :cond_4

    move-object v7, v3

    :cond_4
    iget-object v3, v3, LN/A;->b:LN/A;

    goto :goto_2

    :cond_5
    move-object v3, v7

    :cond_6
    :goto_3
    iput v4, v2, LN/A;->a:I

    invoke-virtual {v2, v3}, LN/A;->a(LN/A;)V

    move-object v2, v6

    goto :goto_4

    :cond_7
    add-int/lit8 v5, v5, 0x1

    :cond_8
    :goto_4
    iget-object v0, v0, LN/A;->b:LN/A;

    goto :goto_0

    :cond_9
    const/4 p0, 0x1

    if-le v5, p0, :cond_a

    move v4, p0

    :cond_a
    return v4
.end method

.method public static final q(LN/y;)V
    .locals 10

    invoke-static {p0}, LN/o;->p(LN/y;)Z

    move-result v0

    if-eqz v0, :cond_f

    sget-object v0, LN/o;->f:LN/w;

    iget v1, v0, LN/w;->a:I

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v2

    const/4 v3, -0x1

    const/4 v4, 0x0

    if-lez v1, :cond_d

    iget v5, v0, LN/w;->a:I

    add-int/lit8 v5, v5, -0x1

    move v6, v4

    :goto_0
    if-gt v6, v5, :cond_c

    add-int v7, v6, v5

    ushr-int/lit8 v7, v7, 0x1

    iget-object v8, v0, LN/w;->b:Ljava/lang/Object;

    check-cast v8, [I

    aget v8, v8, v7

    if-ge v8, v2, :cond_0

    add-int/lit8 v6, v7, 0x1

    goto :goto_0

    :cond_0
    if-le v8, v2, :cond_1

    add-int/lit8 v5, v7, -0x1

    goto :goto_0

    :cond_1
    iget-object v5, v0, LN/w;->c:Ljava/lang/Object;

    check-cast v5, [LD/P0;

    aget-object v5, v5, v7

    const/4 v6, 0x0

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v5

    goto :goto_1

    :cond_2
    move-object v5, v6

    :goto_1
    if-ne p0, v5, :cond_3

    move v3, v7

    goto :goto_8

    :cond_3
    add-int/lit8 v5, v7, -0x1

    :goto_2
    if-ge v3, v5, :cond_7

    iget-object v8, v0, LN/w;->b:Ljava/lang/Object;

    check-cast v8, [I

    aget v8, v8, v5

    if-eq v8, v2, :cond_4

    goto :goto_4

    :cond_4
    iget-object v8, v0, LN/w;->c:Ljava/lang/Object;

    check-cast v8, [LD/P0;

    aget-object v8, v8, v5

    if-eqz v8, :cond_5

    invoke-virtual {v8}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v8

    goto :goto_3

    :cond_5
    move-object v8, v6

    :goto_3
    if-ne v8, p0, :cond_6

    goto :goto_7

    :cond_6
    add-int/lit8 v5, v5, -0x1

    goto :goto_2

    :cond_7
    :goto_4
    add-int/lit8 v7, v7, 0x1

    iget v3, v0, LN/w;->a:I

    move v5, v7

    :goto_5
    if-ge v5, v3, :cond_b

    iget-object v7, v0, LN/w;->b:Ljava/lang/Object;

    check-cast v7, [I

    aget v7, v7, v5

    if-eq v7, v2, :cond_8

    add-int/lit8 v5, v5, 0x1

    neg-int v5, v5

    goto :goto_7

    :cond_8
    iget-object v7, v0, LN/w;->c:Ljava/lang/Object;

    check-cast v7, [LD/P0;

    aget-object v7, v7, v5

    if-eqz v7, :cond_9

    invoke-virtual {v7}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v7

    goto :goto_6

    :cond_9
    move-object v7, v6

    :goto_6
    if-ne v7, p0, :cond_a

    goto :goto_7

    :cond_a
    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_b
    iget v3, v0, LN/w;->a:I

    add-int/lit8 v3, v3, 0x1

    neg-int v5, v3

    :goto_7
    move v3, v5

    goto :goto_8

    :cond_c
    add-int/lit8 v6, v6, 0x1

    neg-int v3, v6

    :goto_8
    if-ltz v3, :cond_d

    goto :goto_a

    :cond_d
    add-int/lit8 v3, v3, 0x1

    neg-int v3, v3

    iget-object v5, v0, LN/w;->c:Ljava/lang/Object;

    check-cast v5, [LD/P0;

    array-length v6, v5

    if-ne v1, v6, :cond_e

    mul-int/lit8 v6, v6, 0x2

    new-array v7, v6, [LD/P0;

    new-array v6, v6, [I

    add-int/lit8 v8, v3, 0x1

    invoke-static {v5, v7, v8, v3, v1}, Ld2/j;->Y([Ljava/lang/Object;[Ljava/lang/Object;III)V

    iget-object v5, v0, LN/w;->c:Ljava/lang/Object;

    check-cast v5, [LD/P0;

    const/4 v9, 0x6

    invoke-static {v5, v7, v4, v3, v9}, Ld2/j;->a0([Ljava/lang/Object;[Ljava/lang/Object;III)V

    iget-object v5, v0, LN/w;->b:Ljava/lang/Object;

    check-cast v5, [I

    invoke-static {v8, v3, v1, v5, v6}, Ld2/j;->X(III[I[I)V

    iget-object v1, v0, LN/w;->b:Ljava/lang/Object;

    check-cast v1, [I

    invoke-static {v4, v3, v9, v1, v6}, Ld2/j;->Z(III[I[I)V

    iput-object v7, v0, LN/w;->c:Ljava/lang/Object;

    iput-object v6, v0, LN/w;->b:Ljava/lang/Object;

    goto :goto_9

    :cond_e
    add-int/lit8 v4, v3, 0x1

    invoke-static {v5, v5, v4, v3, v1}, Ld2/j;->Y([Ljava/lang/Object;[Ljava/lang/Object;III)V

    iget-object v5, v0, LN/w;->b:Ljava/lang/Object;

    check-cast v5, [I

    invoke-static {v4, v3, v1, v5, v5}, Ld2/j;->X(III[I[I)V

    :goto_9
    iget-object v1, v0, LN/w;->c:Ljava/lang/Object;

    check-cast v1, [LD/P0;

    new-instance v4, LD/P0;

    invoke-direct {v4, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    aput-object v4, v1, v3

    iget-object p0, v0, LN/w;->b:Ljava/lang/Object;

    check-cast p0, [I

    aput v2, p0, v3

    iget p0, v0, LN/w;->a:I

    add-int/lit8 p0, p0, 0x1

    iput p0, v0, LN/w;->a:I

    :cond_f
    :goto_a
    return-void
.end method

.method public static final r()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final s(LN/A;ILN/l;)LN/A;
    .locals 4

    const/4 v0, 0x0

    move-object v1, v0

    :goto_0
    if-eqz p0, :cond_2

    iget v2, p0, LN/A;->a:I

    if-eqz v2, :cond_1

    if-gt v2, p1, :cond_1

    invoke-virtual {p2, v2}, LN/l;->c(I)Z

    move-result v2

    if-nez v2, :cond_1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    iget v2, v1, LN/A;->a:I

    iget v3, p0, LN/A;->a:I

    if-ge v2, v3, :cond_1

    :goto_1
    move-object v1, p0

    :cond_1
    iget-object p0, p0, LN/A;->b:LN/A;

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    return-object v1

    :cond_3
    return-object v0
.end method

.method public static final t(LN/A;LN/y;)LN/A;
    .locals 2

    invoke-static {}, LN/o;->k()LN/h;

    move-result-object v0

    invoke-virtual {v0}, LN/h;->f()Lo2/c;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1, p1}, Lo2/c;->i(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {v0}, LN/h;->d()I

    move-result v1

    invoke-virtual {v0}, LN/h;->e()LN/l;

    move-result-object v0

    invoke-static {p0, v1, v0}, LN/o;->s(LN/A;ILN/l;)LN/A;

    move-result-object p0

    if-nez p0, :cond_2

    sget-object p0, LN/o;->b:Ljava/lang/Object;

    monitor-enter p0

    :try_start_0
    invoke-static {}, LN/o;->k()LN/h;

    move-result-object v0

    invoke-interface {p1}, LN/y;->b()LN/A;

    move-result-object p1

    const-string v1, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9"

    invoke-static {p1, v1}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, LN/h;->d()I

    move-result v1

    invoke-virtual {v0}, LN/h;->e()LN/l;

    move-result-object v0

    invoke-static {p1, v1, v0}, LN/o;->s(LN/A;ILN/l;)LN/A;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_1

    monitor-exit p0

    move-object p0, p1

    goto :goto_0

    :cond_1
    :try_start_1
    invoke-static {}, LN/o;->r()V

    const/4 p1, 0x0

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_2
    :goto_0
    return-object p0
.end method

.method public static final u(I)V
    .locals 8

    sget-object v0, LN/o;->e:LM1/j;

    iget-object v1, v0, LM1/j;->e:Ljava/lang/Object;

    check-cast v1, [I

    aget v1, v1, p0

    iget v2, v0, LM1/j;->a:I

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v0, v1, v2}, LM1/j;->h(II)V

    iget v2, v0, LM1/j;->a:I

    add-int/lit8 v2, v2, -0x1

    iput v2, v0, LM1/j;->a:I

    iget-object v2, v0, LM1/j;->b:Ljava/lang/Object;

    check-cast v2, [I

    aget v3, v2, v1

    move v4, v1

    :goto_0
    if-lez v4, :cond_0

    add-int/lit8 v5, v4, 0x1

    shr-int/lit8 v5, v5, 0x1

    add-int/lit8 v5, v5, -0x1

    aget v6, v2, v5

    if-le v6, v3, :cond_0

    invoke-virtual {v0, v5, v4}, LM1/j;->h(II)V

    move v4, v5

    goto :goto_0

    :cond_0
    iget-object v2, v0, LM1/j;->b:Ljava/lang/Object;

    check-cast v2, [I

    iget v3, v0, LM1/j;->a:I

    shr-int/lit8 v3, v3, 0x1

    :goto_1
    if-ge v1, v3, :cond_2

    add-int/lit8 v4, v1, 0x1

    shl-int/lit8 v4, v4, 0x1

    add-int/lit8 v5, v4, -0x1

    iget v6, v0, LM1/j;->a:I

    if-ge v4, v6, :cond_1

    aget v6, v2, v4

    aget v7, v2, v5

    if-ge v6, v7, :cond_1

    aget v5, v2, v1

    if-ge v6, v5, :cond_2

    invoke-virtual {v0, v4, v1}, LM1/j;->h(II)V

    move v1, v4

    goto :goto_1

    :cond_1
    aget v4, v2, v5

    aget v6, v2, v1

    if-ge v4, v6, :cond_2

    invoke-virtual {v0, v5, v1}, LM1/j;->h(II)V

    move v1, v5

    goto :goto_1

    :cond_2
    iget-object v1, v0, LM1/j;->e:Ljava/lang/Object;

    check-cast v1, [I

    iget v2, v0, LM1/j;->c:I

    aput v2, v1, p0

    iput p0, v0, LM1/j;->c:I

    return-void
.end method

.method public static final v(LN/h;Lo2/c;)Ljava/lang/Object;
    .locals 5

    sget-object v0, LN/o;->c:LN/l;

    invoke-virtual {p0}, LN/h;->d()I

    move-result v1

    invoke-virtual {v0, v1}, LN/l;->b(I)LN/l;

    move-result-object v0

    invoke-interface {p1, v0}, Lo2/c;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, LN/o;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget v1, LN/o;->d:I

    add-int/lit8 v2, v1, 0x1

    sput v2, LN/o;->d:I

    sget-object v2, LN/o;->c:LN/l;

    invoke-virtual {p0}, LN/h;->d()I

    move-result v3

    invoke-virtual {v2, v3}, LN/l;->b(I)LN/l;

    move-result-object v2

    sput-object v2, LN/o;->c:LN/l;

    sget-object v3, LN/o;->i:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v4, LN/b;

    invoke-direct {v4, v1, v2}, LN/b;-><init>(ILN/l;)V

    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    invoke-virtual {p0}, LN/h;->c()V

    sget-object p0, LN/o;->c:LN/l;

    invoke-virtual {p0, v1}, LN/l;->e(I)LN/l;

    move-result-object p0

    sput-object p0, LN/o;->c:LN/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static final w(LN/A;LN/y;LN/h;)LN/A;
    .locals 5

    invoke-virtual {p2}, LN/h;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2, p1}, LN/h;->n(LN/y;)V

    :cond_0
    invoke-virtual {p2}, LN/h;->d()I

    move-result v0

    invoke-virtual {p2}, LN/h;->e()LN/l;

    move-result-object v1

    invoke-static {p0, v0, v1}, LN/o;->s(LN/A;ILN/l;)LN/A;

    move-result-object p0

    const/4 v1, 0x0

    if-eqz p0, :cond_5

    iget v2, p0, LN/A;->a:I

    invoke-virtual {p2}, LN/h;->d()I

    move-result v3

    if-ne v2, v3, :cond_1

    return-object p0

    :cond_1
    sget-object v2, LN/o;->b:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    invoke-interface {p1}, LN/y;->b()LN/A;

    move-result-object v3

    invoke-virtual {p2}, LN/h;->e()LN/l;

    move-result-object v4

    invoke-static {v3, v0, v4}, LN/o;->s(LN/A;ILN/l;)LN/A;

    move-result-object v3

    if-eqz v3, :cond_4

    iget v1, v3, LN/A;->a:I

    if-ne v1, v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v3, p1}, LN/o;->m(LN/A;LN/y;)LN/A;

    move-result-object v0

    invoke-virtual {v0, v3}, LN/A;->a(LN/A;)V

    invoke-virtual {p2}, LN/h;->d()I

    move-result v1

    iput v1, v0, LN/A;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v3, v0

    :goto_0
    monitor-exit v2

    iget p0, p0, LN/A;->a:I

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    invoke-virtual {p2, p1}, LN/h;->n(LN/y;)V

    :cond_3
    return-object v3

    :cond_4
    :try_start_1
    invoke-static {}, LN/o;->r()V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p0

    monitor-exit v2

    throw p0

    :cond_5
    invoke-static {}, LN/o;->r()V

    throw v1
.end method
