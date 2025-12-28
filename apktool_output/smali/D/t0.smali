.class public final LD/t0;
.super Lp2/h;
.source "SourceFile"

# interfaces
.implements Lo2/c;


# instance fields
.field public final synthetic e:LD/v0;

.field public final synthetic f:Ln/B;

.field public final synthetic g:Ln/B;

.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Ljava/util/List;

.field public final synthetic j:Ln/B;

.field public final synthetic k:Ljava/util/List;

.field public final synthetic l:Ln/B;

.field public final synthetic m:Ljava/util/Set;


# direct methods
.method public constructor <init>(LD/v0;Ln/B;Ln/B;Ljava/util/List;Ljava/util/List;Ln/B;Ljava/util/List;Ln/B;Ljava/util/Set;)V
    .locals 0

    iput-object p1, p0, LD/t0;->e:LD/v0;

    iput-object p2, p0, LD/t0;->f:Ln/B;

    iput-object p3, p0, LD/t0;->g:Ln/B;

    iput-object p4, p0, LD/t0;->h:Ljava/util/List;

    iput-object p5, p0, LD/t0;->i:Ljava/util/List;

    iput-object p6, p0, LD/t0;->j:Ln/B;

    iput-object p7, p0, LD/t0;->k:Ljava/util/List;

    iput-object p8, p0, LD/t0;->l:Ln/B;

    iput-object p9, p0, LD/t0;->m:Ljava/util/Set;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lp2/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    iget-object v0, v1, LD/t0;->e:LD/v0;

    iget-object v4, v0, LD/v0;->b:Ljava/lang/Object;

    monitor-enter v4

    :try_start_0
    invoke-virtual {v0}, LD/v0;->f()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_a

    monitor-exit v4

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v0, :cond_2

    const-string v0, "Recomposer:animation"

    iget-object v6, v1, LD/t0;->e:LD/v0;

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_1
    iget-object v0, v6, LD/v0;->a:LD/h;

    invoke-virtual {v0, v2, v3}, LD/h;->c(J)V

    sget-object v2, LN/o;->b:Ljava/lang/Object;

    monitor-enter v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    sget-object v0, LN/o;->i:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LN/b;

    iget-object v0, v0, LN/c;->h:Ln/B;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ln/B;->h()Z

    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne v0, v5, :cond_0

    move v0, v5

    goto :goto_0

    :cond_0
    move v0, v4

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :goto_0
    :try_start_3
    monitor-exit v2

    if-eqz v0, :cond_1

    invoke-static {}, LN/o;->a()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :cond_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    goto :goto_2

    :goto_1
    :try_start_4
    monitor-exit v2

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :cond_2
    :goto_2
    const-string v0, "Recomposer:recompose"

    iget-object v6, v1, LD/t0;->e:LD/v0;

    iget-object v12, v1, LD/t0;->f:Ln/B;

    iget-object v13, v1, LD/t0;->g:Ln/B;

    iget-object v2, v1, LD/t0;->h:Ljava/util/List;

    iget-object v8, v1, LD/t0;->i:Ljava/util/List;

    iget-object v3, v1, LD/t0;->j:Ln/B;

    iget-object v14, v1, LD/t0;->k:Ljava/util/List;

    iget-object v15, v1, LD/t0;->l:Ln/B;

    iget-object v7, v1, LD/t0;->m:Ljava/util/Set;

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_5
    invoke-static {v6}, LD/v0;->b(LD/v0;)Z

    iget-object v9, v6, LD/v0;->b:Ljava/lang/Object;

    monitor-enter v9
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    :try_start_6
    iget-object v0, v6, LD/v0;->h:LF/d;

    iget v10, v0, LF/d;->f:I

    if-lez v10, :cond_4

    iget-object v0, v0, LF/d;->d:[Ljava/lang/Object;

    move v11, v4

    :goto_3
    aget-object v16, v0, v11

    move-object/from16 v5, v16

    check-cast v5, LD/t;

    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v11, v11, 0x1

    if-lt v11, v10, :cond_3

    goto :goto_4

    :cond_3
    const/4 v5, 0x1

    goto :goto_3

    :catchall_2
    move-exception v0

    goto/16 :goto_2d

    :cond_4
    :goto_4
    iget-object v0, v6, LD/v0;->h:LF/d;

    invoke-virtual {v0}, LF/d;->g()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :try_start_7
    monitor-exit v9

    invoke-virtual {v12}, Ln/B;->b()V

    invoke-virtual {v13}, Ln/B;->b()V

    :goto_5
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v5, 0x2

    if-eqz v0, :cond_5

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    :cond_5
    move-object v5, v6

    move-object/from16 v24, v12

    move-object/from16 v25, v13

    goto/16 :goto_1d

    :cond_6
    invoke-interface {v14}, Ljava/util/Collection;->isEmpty()Z

    move-result v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    const/4 v7, 0x6

    if-nez v0, :cond_9

    :try_start_8
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v0

    move v9, v4

    :goto_6
    if-ge v9, v0, :cond_7

    invoke-interface {v14, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LD/t;

    invoke-virtual {v15, v10}, Ln/B;->a(Ljava/lang/Object;)Z

    add-int/lit8 v9, v9, 0x1

    goto :goto_6

    :catchall_3
    move-exception v0

    goto :goto_a

    :catch_0
    move-exception v0

    goto :goto_8

    :cond_7
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v0

    move v9, v4

    :goto_7
    if-ge v9, v0, :cond_8

    invoke-interface {v14, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LD/t;

    invoke-virtual {v10}, LD/t;->d()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    add-int/lit8 v9, v9, 0x1

    goto :goto_7

    :cond_8
    :try_start_9
    invoke-interface {v14}, Ljava/util/List;->clear()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    goto :goto_b

    :catchall_4
    move-exception v0

    goto/16 :goto_2e

    :goto_8
    :try_start_a
    invoke-static {v6, v0, v4, v7}, LD/v0;->l(LD/v0;Ljava/lang/Exception;ZI)V

    move-object v7, v2

    move-object v9, v14

    move-object v10, v3

    move-object v11, v15

    invoke-static/range {v6 .. v13}, LD/u0;->n(LD/v0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ln/B;Ln/B;Ln/B;Ln/B;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    :try_start_b
    invoke-interface {v14}, Ljava/util/List;->clear()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    :goto_9
    invoke-static {}, Landroid/os/Trace;->endSection()V

    goto/16 :goto_2b

    :goto_a
    :try_start_c
    invoke-interface {v14}, Ljava/util/List;->clear()V

    throw v0

    :cond_9
    :goto_b
    invoke-virtual {v3}, Ln/B;->h()Z

    move-result v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    const-wide/16 v16, 0xff

    const/4 v11, 0x7

    const-wide v18, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const/16 v4, 0x8

    if-eqz v0, :cond_f

    :try_start_d
    invoke-virtual {v15, v3}, Ln/B;->i(Ln/B;)V

    iget-object v0, v3, Ln/B;->b:[Ljava/lang/Object;

    iget-object v7, v3, Ln/B;->a:[J

    array-length v9, v7
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_3
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    sub-int/2addr v9, v5

    move-object/from16 v23, v6

    if-ltz v9, :cond_d

    const/4 v10, 0x0

    :goto_c
    :try_start_e
    aget-wide v5, v7, v10
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_2
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    move-object/from16 v24, v12

    move-object/from16 v25, v13

    not-long v12, v5

    shl-long/2addr v12, v11

    and-long/2addr v12, v5

    and-long v12, v12, v18

    cmp-long v12, v12, v18

    if-eqz v12, :cond_c

    sub-int v12, v10, v9

    not-int v12, v12

    ushr-int/lit8 v12, v12, 0x1f

    rsub-int/lit8 v12, v12, 0x8

    const/4 v13, 0x0

    :goto_d
    if-ge v13, v12, :cond_b

    and-long v26, v5, v16

    const-wide/16 v20, 0x80

    cmp-long v26, v26, v20

    if-gez v26, :cond_a

    shl-int/lit8 v26, v10, 0x3

    add-int v26, v26, v13

    :try_start_f
    aget-object v26, v0, v26

    check-cast v26, LD/t;

    invoke-virtual/range {v26 .. v26}, LD/t;->f()V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_1
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    goto :goto_f

    :goto_e
    move-object/from16 v5, v23

    const/4 v4, 0x0

    const/4 v6, 0x6

    goto :goto_11

    :catchall_5
    move-exception v0

    goto :goto_12

    :catch_1
    move-exception v0

    goto :goto_e

    :cond_a
    :goto_f
    shr-long/2addr v5, v4

    add-int/lit8 v13, v13, 0x1

    goto :goto_d

    :cond_b
    if-ne v12, v4, :cond_e

    :cond_c
    if-eq v10, v9, :cond_e

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v12, v24

    move-object/from16 v13, v25

    goto :goto_c

    :catch_2
    move-exception v0

    :goto_10
    move-object/from16 v24, v12

    move-object/from16 v25, v13

    goto :goto_e

    :cond_d
    move-object/from16 v24, v12

    move-object/from16 v25, v13

    :cond_e
    :try_start_10
    invoke-virtual {v3}, Ln/B;->b()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    move-object/from16 v5, v23

    goto :goto_13

    :catch_3
    move-exception v0

    move-object/from16 v23, v6

    goto :goto_10

    :goto_11
    :try_start_11
    invoke-static {v5, v0, v4, v6}, LD/v0;->l(LD/v0;Ljava/lang/Exception;ZI)V

    move-object v6, v5

    move-object v7, v2

    move-object v9, v14

    move-object v10, v3

    move-object v11, v15

    move-object/from16 v12, v24

    move-object/from16 v13, v25

    invoke-static/range {v6 .. v13}, LD/u0;->n(LD/v0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ln/B;Ln/B;Ln/B;Ln/B;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_5

    :try_start_12
    invoke-virtual {v3}, Ln/B;->b()V

    goto/16 :goto_9

    :goto_12
    invoke-virtual {v3}, Ln/B;->b()V

    throw v0

    :cond_f
    move-object v5, v6

    move-object/from16 v24, v12

    move-object/from16 v25, v13

    :goto_13
    invoke-virtual {v15}, Ln/B;->h()Z

    move-result v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_4

    if-eqz v0, :cond_15

    :try_start_13
    iget-object v0, v15, Ln/B;->b:[Ljava/lang/Object;

    iget-object v6, v15, Ln/B;->a:[J

    array-length v7, v6

    const/4 v9, 0x2

    sub-int/2addr v7, v9

    if-ltz v7, :cond_13

    const/4 v9, 0x0

    :goto_14
    aget-wide v12, v6, v9
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_5
    .catchall {:try_start_13 .. :try_end_13} :catchall_6

    move-object/from16 v23, v5

    not-long v4, v12

    shl-long/2addr v4, v11

    and-long/2addr v4, v12

    and-long v4, v4, v18

    cmp-long v4, v4, v18

    if-eqz v4, :cond_12

    sub-int v4, v9, v7

    not-int v4, v4

    ushr-int/lit8 v4, v4, 0x1f

    const/16 v5, 0x8

    rsub-int/lit8 v4, v4, 0x8

    const/4 v5, 0x0

    :goto_15
    if-ge v5, v4, :cond_11

    and-long v26, v12, v16

    const-wide/16 v20, 0x80

    cmp-long v22, v26, v20

    if-gez v22, :cond_10

    shl-int/lit8 v22, v9, 0x3

    add-int v22, v22, v5

    :try_start_14
    aget-object v22, v0, v22

    check-cast v22, LD/t;

    invoke-virtual/range {v22 .. v22}, LD/t;->g()V
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_4
    .catchall {:try_start_14 .. :try_end_14} :catchall_6

    :cond_10
    const/16 v10, 0x8

    goto :goto_18

    :goto_16
    move-object/from16 v5, v23

    :goto_17
    const/4 v4, 0x0

    const/4 v6, 0x6

    goto :goto_1a

    :catchall_6
    move-exception v0

    goto :goto_1b

    :catch_4
    move-exception v0

    goto :goto_16

    :goto_18
    shr-long/2addr v12, v10

    add-int/lit8 v5, v5, 0x1

    goto :goto_15

    :cond_11
    const/16 v10, 0x8

    const-wide/16 v20, 0x80

    if-ne v4, v10, :cond_14

    goto :goto_19

    :cond_12
    const/16 v10, 0x8

    const-wide/16 v20, 0x80

    :goto_19
    if-eq v9, v7, :cond_14

    add-int/lit8 v9, v9, 0x1

    move v4, v10

    move-object/from16 v5, v23

    goto :goto_14

    :catch_5
    move-exception v0

    move-object/from16 v23, v5

    goto :goto_17

    :cond_13
    move-object/from16 v23, v5

    :cond_14
    :try_start_15
    invoke-virtual {v15}, Ln/B;->b()V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_4

    move-object/from16 v5, v23

    goto :goto_1c

    :goto_1a
    :try_start_16
    invoke-static {v5, v0, v4, v6}, LD/v0;->l(LD/v0;Ljava/lang/Exception;ZI)V

    move-object v6, v5

    move-object v7, v2

    move-object v9, v14

    move-object v10, v3

    move-object v11, v15

    move-object/from16 v12, v24

    move-object/from16 v13, v25

    invoke-static/range {v6 .. v13}, LD/u0;->n(LD/v0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ln/B;Ln/B;Ln/B;Ln/B;)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_6

    :try_start_17
    invoke-virtual {v15}, Ln/B;->b()V

    goto/16 :goto_9

    :goto_1b
    invoke-virtual {v15}, Ln/B;->b()V

    throw v0

    :cond_15
    :goto_1c
    iget-object v2, v5, LD/v0;->b:Ljava/lang/Object;

    monitor-enter v2
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_4

    :try_start_18
    invoke-virtual {v5}, LD/v0;->e()Ly2/e;
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_7

    :try_start_19
    monitor-exit v2

    invoke-static {}, LN/o;->k()LN/h;

    move-result-object v0

    invoke-virtual {v0}, LN/h;->m()V

    invoke-virtual/range {v25 .. v25}, Ln/B;->b()V

    invoke-virtual/range {v24 .. v24}, Ln/B;->b()V

    const/4 v0, 0x0

    iput-object v0, v5, LD/v0;->n:Ljava/util/LinkedHashSet;

    goto/16 :goto_9

    :catchall_7
    move-exception v0

    move-object v3, v0

    monitor-exit v2

    throw v3
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_4

    :goto_1d
    :try_start_1a
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    move v6, v4

    :goto_1e
    if-ge v6, v0, :cond_17

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LD/t;
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_8
    .catchall {:try_start_1a .. :try_end_1a} :catchall_8

    move-object/from16 v12, v24

    :try_start_1b
    invoke-static {v5, v9, v12}, LD/v0;->a(LD/v0;LD/t;Ln/B;)LD/t;

    move-result-object v10

    if-eqz v10, :cond_16

    invoke-interface {v14, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_6
    .catchall {:try_start_1b .. :try_end_1b} :catchall_8

    :cond_16
    move-object/from16 v13, v25

    goto :goto_21

    :catchall_8
    move-exception v0

    goto/16 :goto_2c

    :catch_6
    move-exception v0

    :goto_1f
    move-object/from16 v13, v25

    :goto_20
    const/4 v4, 0x1

    const/4 v6, 0x2

    goto/16 :goto_2a

    :goto_21
    :try_start_1c
    invoke-virtual {v13, v9}, Ln/B;->a(Ljava/lang/Object;)Z
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_7
    .catchall {:try_start_1c .. :try_end_1c} :catchall_8

    add-int/lit8 v6, v6, 0x1

    move-object/from16 v24, v12

    move-object/from16 v25, v13

    goto :goto_1e

    :catch_7
    move-exception v0

    goto :goto_20

    :catch_8
    move-exception v0

    move-object/from16 v12, v24

    goto :goto_1f

    :cond_17
    move-object/from16 v12, v24

    move-object/from16 v13, v25

    :try_start_1d
    invoke-interface {v2}, Ljava/util/List;->clear()V

    invoke-virtual {v12}, Ln/B;->h()Z

    move-result v0

    if-nez v0, :cond_18

    iget-object v0, v5, LD/v0;->h:LF/d;

    invoke-virtual {v0}, LF/d;->k()Z

    move-result v0

    if-eqz v0, :cond_1e

    :cond_18
    iget-object v6, v5, LD/v0;->b:Ljava/lang/Object;

    monitor-enter v6
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_4

    :try_start_1e
    invoke-virtual {v5}, LD/v0;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v9

    move v10, v4

    :goto_22
    if-ge v10, v9, :cond_1a

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LD/t;

    invoke-virtual {v13, v11}, Ln/B;->c(Ljava/lang/Object;)Z

    move-result v16

    if-nez v16, :cond_19

    invoke-virtual {v11, v7}, LD/t;->q(Ljava/util/Set;)Z

    move-result v16

    if-eqz v16, :cond_19

    invoke-interface {v2, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_23

    :catchall_9
    move-exception v0

    goto/16 :goto_29

    :cond_19
    :goto_23
    add-int/lit8 v10, v10, 0x1

    goto :goto_22

    :cond_1a
    iget-object v0, v5, LD/v0;->h:LF/d;

    iget v9, v0, LF/d;->f:I

    move v10, v4

    move v11, v10

    :goto_24
    if-ge v10, v9, :cond_1d

    iget-object v4, v0, LF/d;->d:[Ljava/lang/Object;

    aget-object v4, v4, v10

    check-cast v4, LD/t;

    invoke-virtual {v13, v4}, Ln/B;->c(Ljava/lang/Object;)Z

    move-result v16

    if-nez v16, :cond_1b

    invoke-interface {v2, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v16

    if-nez v16, :cond_1b

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v11, v11, 0x1

    goto :goto_25

    :cond_1b
    if-lez v11, :cond_1c

    iget-object v4, v0, LF/d;->d:[Ljava/lang/Object;

    sub-int v16, v10, v11

    aget-object v17, v4, v10

    aput-object v17, v4, v16

    :cond_1c
    :goto_25
    add-int/lit8 v10, v10, 0x1

    const/4 v4, 0x0

    goto :goto_24

    :cond_1d
    iget-object v4, v0, LF/d;->d:[Ljava/lang/Object;

    sub-int v10, v9, v11

    invoke-static {v4, v10, v9}, Ld2/j;->c0([Ljava/lang/Object;II)V

    iput v10, v0, LF/d;->f:I
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_9

    :try_start_1f
    monitor-exit v6

    :cond_1e
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_4

    if-eqz v0, :cond_20

    :try_start_20
    invoke-static {v8, v5}, LD/u0;->p(Ljava/util/List;LD/v0;)V

    :goto_26
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_20

    invoke-virtual {v5, v8, v12}, LD/v0;->j(Ljava/util/List;Ln/B;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Ln/B;->d(Ljava/lang/Object;)I

    move-result v6

    iget-object v9, v3, Ln/B;->b:[Ljava/lang/Object;

    aput-object v4, v9, v6

    goto :goto_27

    :cond_1f
    invoke-static {v8, v5}, LD/u0;->p(Ljava/util/List;LD/v0;)V
    :try_end_20
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_20} :catch_9
    .catchall {:try_start_20 .. :try_end_20} :catchall_4

    goto :goto_26

    :catch_9
    move-exception v0

    const/4 v4, 0x1

    const/4 v6, 0x2

    goto :goto_28

    :cond_20
    move-object v6, v5

    const/4 v4, 0x0

    goto/16 :goto_5

    :goto_28
    :try_start_21
    invoke-static {v5, v0, v4, v6}, LD/v0;->l(LD/v0;Ljava/lang/Exception;ZI)V

    move-object v6, v5

    move-object v7, v2

    move-object v9, v14

    move-object v10, v3

    move-object v11, v15

    invoke-static/range {v6 .. v13}, LD/u0;->n(LD/v0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ln/B;Ln/B;Ln/B;Ln/B;)V

    goto/16 :goto_9

    :goto_29
    monitor-exit v6

    throw v0
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_4

    :goto_2a
    :try_start_22
    invoke-static {v5, v0, v4, v6}, LD/v0;->l(LD/v0;Ljava/lang/Exception;ZI)V

    move-object v6, v5

    move-object v7, v2

    move-object v9, v14

    move-object v10, v3

    move-object v11, v15

    invoke-static/range {v6 .. v13}, LD/u0;->n(LD/v0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ln/B;Ln/B;Ln/B;Ln/B;)V
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_8

    :try_start_23
    invoke-interface {v2}, Ljava/util/List;->clear()V
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_4

    goto/16 :goto_9

    :goto_2b
    sget-object v0, Lc2/m;->a:Lc2/m;

    return-object v0

    :goto_2c
    :try_start_24
    invoke-interface {v2}, Ljava/util/List;->clear()V

    throw v0

    :goto_2d
    monitor-exit v9

    throw v0
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_4

    :goto_2e
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :catchall_a
    move-exception v0

    move-object v2, v0

    monitor-exit v4

    throw v2
.end method
