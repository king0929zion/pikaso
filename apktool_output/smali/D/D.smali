.class public final LD/D;
.super LN/z;
.source "SourceFile"

# interfaces
.implements LD/L0;


# instance fields
.field public final e:Lp2/h;

.field public f:LD/B;


# direct methods
.method public constructor <init>(Lo2/a;)V
    .locals 0

    invoke-direct {p0}, LN/z;-><init>()V

    check-cast p1, Lp2/h;

    iput-object p1, p0, LD/D;->e:Lp2/h;

    new-instance p1, LD/B;

    invoke-direct {p1}, LD/B;-><init>()V

    iput-object p1, p0, LD/D;->f:LD/B;

    return-void
.end method


# virtual methods
.method public final a(LN/A;)V
    .locals 1

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>"

    invoke-static {p1, v0}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LD/B;

    iput-object p1, p0, LD/D;->f:LD/B;

    return-void
.end method

.method public final b()LN/A;
    .locals 1

    iget-object v0, p0, LD/D;->f:LD/B;

    return-object v0
.end method

.method public final g(LD/B;LN/h;ZLo2/a;)LD/B;
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    invoke-virtual {v0, v1, v2}, LD/B;->c(LD/D;LN/h;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_b

    if-eqz p3, :cond_a

    invoke-static {}, LD/d;->v()LF/d;

    move-result-object v3

    iget v5, v3, LF/d;->f:I

    if-lez v5, :cond_1

    iget-object v6, v3, LF/d;->d:[Ljava/lang/Object;

    move v7, v4

    :cond_0
    aget-object v8, v6, v7

    check-cast v8, LD/m;

    invoke-virtual {v8}, LD/m;->b()V

    add-int/lit8 v7, v7, 0x1

    if-lt v7, v5, :cond_0

    :cond_1
    :try_start_0
    iget-object v5, v0, LD/B;->e:Ln/w;

    sget-object v6, LD/I0;->a:LB0/a;

    invoke-virtual {v6}, LB0/a;->i()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LL/c;

    if-nez v7, :cond_2

    new-instance v7, LL/c;

    invoke-direct {v7, v4}, LL/c;-><init>(I)V

    invoke-virtual {v6, v7}, LB0/a;->E(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :cond_2
    :goto_0
    iget v6, v7, LL/c;->a:I

    iget-object v8, v5, Ln/w;->b:[Ljava/lang/Object;

    iget-object v9, v5, Ln/w;->c:[I

    iget-object v5, v5, Ln/w;->a:[J

    array-length v10, v5

    add-int/lit8 v10, v10, -0x2

    if-ltz v10, :cond_7

    move v11, v4

    :goto_1
    aget-wide v12, v5, v11

    not-long v14, v12

    const/16 v16, 0x7

    shl-long v14, v14, v16

    and-long/2addr v14, v12

    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v14, v14, v16

    cmp-long v14, v14, v16

    if-eqz v14, :cond_6

    sub-int v14, v11, v10

    not-int v14, v14

    ushr-int/lit8 v14, v14, 0x1f

    const/16 v15, 0x8

    rsub-int/lit8 v14, v14, 0x8

    :goto_2
    if-ge v4, v14, :cond_5

    const-wide/16 v17, 0xff

    and-long v17, v12, v17

    const-wide/16 v19, 0x80

    cmp-long v17, v17, v19

    if-gez v17, :cond_4

    shl-int/lit8 v17, v11, 0x3

    add-int v17, v17, v4

    aget-object v18, v8, v17

    aget v17, v9, v17

    move-object/from16 v15, v18

    check-cast v15, LN/y;

    add-int v2, v6, v17

    iput v2, v7, LL/c;->a:I

    invoke-virtual/range {p2 .. p2}, LN/h;->f()Lo2/c;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-interface {v2, v15}, Lo2/c;->i(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    const/16 v2, 0x8

    goto :goto_3

    :cond_4
    move v2, v15

    :goto_3
    shr-long/2addr v12, v2

    add-int/lit8 v4, v4, 0x1

    move v15, v2

    move-object/from16 v2, p2

    goto :goto_2

    :cond_5
    move v2, v15

    if-ne v14, v2, :cond_7

    :cond_6
    if-eq v11, v10, :cond_7

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v2, p2

    const/4 v4, 0x0

    goto :goto_1

    :cond_7
    iput v6, v7, LL/c;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget v2, v3, LF/d;->f:I

    if-lez v2, :cond_a

    iget-object v3, v3, LF/d;->d:[Ljava/lang/Object;

    const/4 v4, 0x0

    :cond_8
    aget-object v5, v3, v4

    check-cast v5, LD/m;

    invoke-virtual {v5}, LD/m;->a()V

    add-int/lit8 v4, v4, 0x1

    if-lt v4, v2, :cond_8

    goto :goto_6

    :goto_4
    iget v2, v3, LF/d;->f:I

    if-lez v2, :cond_9

    iget-object v3, v3, LF/d;->d:[Ljava/lang/Object;

    const/4 v4, 0x0

    :goto_5
    aget-object v5, v3, v4

    check-cast v5, LD/m;

    invoke-virtual {v5}, LD/m;->a()V

    add-int/lit8 v4, v4, 0x1

    if-ge v4, v2, :cond_9

    goto :goto_5

    :cond_9
    throw v0

    :cond_a
    :goto_6
    return-object v0

    :cond_b
    new-instance v0, Ln/w;

    invoke-direct {v0}, Ln/w;-><init>()V

    sget-object v2, LD/I0;->a:LB0/a;

    invoke-virtual {v2}, LB0/a;->i()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LL/c;

    if-nez v3, :cond_c

    new-instance v3, LL/c;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, LL/c;-><init>(I)V

    invoke-virtual {v2, v3}, LB0/a;->E(Ljava/lang/Object;)V

    goto :goto_7

    :cond_c
    const/4 v4, 0x0

    :goto_7
    iget v2, v3, LL/c;->a:I

    invoke-static {}, LD/d;->v()LF/d;

    move-result-object v5

    iget v6, v5, LF/d;->f:I

    if-lez v6, :cond_e

    iget-object v7, v5, LF/d;->d:[Ljava/lang/Object;

    move v8, v4

    :cond_d
    aget-object v9, v7, v8

    check-cast v9, LD/m;

    invoke-virtual {v9}, LD/m;->b()V

    add-int/lit8 v8, v8, 0x1

    if-lt v8, v6, :cond_d

    :cond_e
    add-int/lit8 v6, v2, 0x1

    :try_start_1
    iput v6, v3, LL/c;->a:I

    new-instance v6, LD/C;

    invoke-direct {v6, v1, v3, v0, v2}, LD/C;-><init>(LD/D;LL/c;Ln/w;I)V

    move-object/from16 v7, p4

    invoke-static {v6, v7}, LN/t;->c(Lo2/c;Lo2/a;)Ljava/lang/Object;

    move-result-object v6

    iput v2, v3, LL/c;->a:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    iget v2, v5, LF/d;->f:I

    if-lez v2, :cond_10

    iget-object v3, v5, LF/d;->d:[Ljava/lang/Object;

    :cond_f
    aget-object v5, v3, v4

    check-cast v5, LD/m;

    invoke-virtual {v5}, LD/m;->a()V

    add-int/lit8 v4, v4, 0x1

    if-lt v4, v2, :cond_f

    :cond_10
    sget-object v2, LN/o;->b:Ljava/lang/Object;

    monitor-enter v2

    :try_start_2
    invoke-static {}, LN/o;->k()LN/h;

    move-result-object v3

    iget-object v4, v1, LD/D;->f:LD/B;

    monitor-enter v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    invoke-static {v4, v1}, LN/o;->m(LN/A;LN/y;)LN/A;

    move-result-object v5

    invoke-virtual {v5, v4}, LN/A;->a(LN/A;)V

    invoke-virtual {v3}, LN/h;->d()I

    move-result v4

    iput v4, v5, LN/A;->a:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :try_start_4
    monitor-exit v2

    check-cast v5, LD/B;

    iput-object v0, v5, LD/B;->e:Ln/w;

    invoke-virtual {v5, v1, v3}, LD/B;->d(LD/D;LN/h;)I

    move-result v0

    iput v0, v5, LD/B;->g:I

    iput-object v6, v5, LD/B;->f:Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    monitor-exit v2

    sget-object v0, LD/I0;->a:LB0/a;

    invoke-virtual {v0}, LB0/a;->i()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LL/c;

    if-eqz v0, :cond_11

    iget v0, v0, LL/c;->a:I

    if-nez v0, :cond_11

    invoke-static {}, LN/o;->k()LN/h;

    move-result-object v0

    invoke-virtual {v0}, LN/h;->m()V

    monitor-enter v2

    :try_start_5
    invoke-static {}, LN/o;->k()LN/h;

    move-result-object v0

    invoke-virtual {v0}, LN/h;->d()I

    move-result v3

    iput v3, v5, LD/B;->c:I

    invoke-virtual {v0}, LN/h;->h()I

    move-result v0

    iput v0, v5, LD/B;->d:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    monitor-exit v2

    goto :goto_8

    :catchall_1
    move-exception v0

    monitor-exit v2

    throw v0

    :cond_11
    :goto_8
    return-object v5

    :catchall_2
    move-exception v0

    goto :goto_9

    :catchall_3
    move-exception v0

    :try_start_6
    monitor-exit v2

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :goto_9
    monitor-exit v2

    throw v0

    :catchall_4
    move-exception v0

    iget v2, v5, LF/d;->f:I

    if-lez v2, :cond_12

    iget-object v3, v5, LF/d;->d:[Ljava/lang/Object;

    :goto_a
    aget-object v5, v3, v4

    check-cast v5, LD/m;

    invoke-virtual {v5}, LD/m;->a()V

    add-int/lit8 v4, v4, 0x1

    if-ge v4, v2, :cond_12

    goto :goto_a

    :cond_12
    throw v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 4

    invoke-static {}, LN/o;->k()LN/h;

    move-result-object v0

    invoke-virtual {v0}, LN/h;->f()Lo2/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lo2/c;->i(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-static {}, LN/o;->k()LN/h;

    move-result-object v0

    iget-object v1, p0, LD/D;->f:LD/B;

    invoke-static {v1, v0}, LN/o;->j(LN/A;LN/h;)LN/A;

    move-result-object v1

    check-cast v1, LD/B;

    iget-object v2, p0, LD/D;->e:Lp2/h;

    const/4 v3, 0x1

    invoke-virtual {p0, v1, v0, v3, v2}, LD/D;->g(LD/B;LN/h;ZLo2/a;)LD/B;

    move-result-object v0

    iget-object v0, v0, LD/B;->f:Ljava/lang/Object;

    return-object v0
.end method

.method public final h()LD/B;
    .locals 4

    invoke-static {}, LN/o;->k()LN/h;

    move-result-object v0

    iget-object v1, p0, LD/D;->f:LD/B;

    invoke-static {v1, v0}, LN/o;->j(LN/A;LN/h;)LN/A;

    move-result-object v1

    check-cast v1, LD/B;

    iget-object v2, p0, LD/D;->e:Lp2/h;

    const/4 v3, 0x0

    invoke-virtual {p0, v1, v0, v3, v2}, LD/D;->g(LD/B;LN/h;ZLo2/a;)LD/B;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LD/D;->f:LD/B;

    invoke-static {v0}, LN/o;->i(LN/A;)LN/A;

    move-result-object v0

    check-cast v0, LD/B;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DerivedState(value="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LD/D;->f:LD/B;

    invoke-static {v1}, LN/o;->i(LN/A;)LN/A;

    move-result-object v1

    check-cast v1, LD/B;

    invoke-static {}, LN/o;->k()LN/h;

    move-result-object v2

    invoke-virtual {v1, p0, v2}, LD/B;->c(LD/D;LN/h;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, LD/B;->f:Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, "<Not calculated>"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
