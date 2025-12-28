.class public abstract LV0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/a;

.field public static final b:Ln/o;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    new-instance v0, LV0/j;

    invoke-direct {v0}, La/a;-><init>()V

    sput-object v0, LV0/g;->a:La/a;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_1

    new-instance v0, LV0/i;

    invoke-direct {v0}, LV0/h;-><init>()V

    sput-object v0, LV0/g;->a:La/a;

    goto :goto_0

    :cond_1
    new-instance v0, LV0/h;

    invoke-direct {v0}, LV0/h;-><init>()V

    sput-object v0, LV0/g;->a:La/a;

    :goto_0
    new-instance v0, Ln/o;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Ln/o;-><init>(I)V

    sput-object v0, LV0/g;->b:Ln/o;

    return-void
.end method

.method public static a(Landroid/content/Context;LU0/e;Landroid/content/res/Resources;ILjava/lang/String;IILU0/b;Z)Landroid/graphics/Typeface;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v7, p6

    move-object/from16 v2, p7

    const/4 v3, 0x2

    const/4 v8, 0x1

    const/4 v4, 0x0

    instance-of v5, v1, LU0/h;

    const/4 v9, -0x3

    if-eqz v5, :cond_d

    check-cast v1, LU0/h;

    iget-object v5, v1, LU0/h;->d:Ljava/lang/String;

    const/4 v10, 0x0

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v5, v4}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v5

    sget-object v6, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-static {v6, v4}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v6

    if-eqz v5, :cond_1

    invoke-virtual {v5, v6}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    move-object v5, v10

    :goto_1
    if-eqz v5, :cond_3

    if-eqz v2, :cond_2

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, LR/b;

    invoke-direct {v1, v2, v8, v5}, LR/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_2
    return-object v5

    :cond_3
    if-eqz p8, :cond_5

    iget v5, v1, LU0/h;->c:I

    if-nez v5, :cond_4

    :goto_2
    move v5, v8

    goto :goto_3

    :cond_4
    move v5, v4

    goto :goto_3

    :cond_5
    if-nez v2, :cond_4

    goto :goto_2

    :goto_3
    const/4 v6, -0x1

    if-eqz p8, :cond_6

    iget v11, v1, LU0/h;->b:I

    goto :goto_4

    :cond_6
    move v11, v6

    :goto_4
    new-instance v12, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v13

    invoke-direct {v12, v13}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v13, LA/t;

    const/16 v14, 0xd

    invoke-direct {v13, v14, v4}, LA/t;-><init>(IZ)V

    iput-object v2, v13, LA/t;->e:Ljava/lang/Object;

    iget-object v14, v1, LU0/h;->a:La1/c;

    new-instance v15, LB2/i;

    const/4 v1, 0x5

    invoke-direct {v15, v13, v1, v12}, LB2/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    if-eqz v5, :cond_9

    sget-object v1, La1/g;->a:Ln/o;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v14, La1/c;->f:Ljava/io/Serializable;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v1, La1/g;->a:Ln/o;

    invoke-virtual {v1, v2}, Ln/o;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Typeface;

    if-eqz v1, :cond_7

    new-instance v0, LD2/h;

    invoke-direct {v0, v3, v13, v1, v4}, LD2/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    invoke-virtual {v12, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_5
    move-object v10, v1

    goto/16 :goto_9

    :cond_7
    if-ne v11, v6, :cond_8

    invoke-static {v2, v0, v14, v7}, La1/g;->a(Ljava/lang/String;Landroid/content/Context;La1/c;I)La1/f;

    move-result-object v0

    invoke-virtual {v15, v0}, LB2/i;->q(La1/f;)V

    iget-object v10, v0, La1/f;->a:Landroid/graphics/Typeface;

    goto/16 :goto_9

    :cond_8
    new-instance v8, La1/d;

    const/4 v6, 0x0

    move-object v1, v8

    move-object/from16 v3, p0

    move-object v4, v14

    move/from16 v5, p6

    invoke-direct/range {v1 .. v6}, La1/d;-><init>(Ljava/lang/String;Landroid/content/Context;La1/c;II)V

    :try_start_0
    sget-object v0, La1/g;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-interface {v0, v8}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_3

    int-to-long v1, v11

    :try_start_1
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_2

    :try_start_2
    check-cast v0, La1/f;

    invoke-virtual {v15, v0}, LB2/i;->q(La1/f;)V

    iget-object v10, v0, La1/f;->a:Landroid/graphics/Typeface;

    goto/16 :goto_9

    :catch_0
    move-exception v0

    goto :goto_6

    :catch_1
    move-exception v0

    goto :goto_7

    :catch_2
    new-instance v0, Ljava/lang/InterruptedException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_6
    throw v0

    :goto_7
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_3

    :catch_3
    new-instance v0, La1/a;

    iget-object v1, v15, LB2/i;->e:Ljava/lang/Object;

    check-cast v1, LA/t;

    invoke-direct {v0, v1, v9}, La1/a;-><init>(LA/t;I)V

    iget-object v1, v15, LB2/i;->f:Ljava/lang/Object;

    check-cast v1, Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_9

    :cond_9
    sget-object v1, La1/g;->a:Ln/o;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v14, La1/c;->f:Ljava/io/Serializable;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    sget-object v1, La1/g;->a:Ln/o;

    invoke-virtual {v1, v9}, Ln/o;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Typeface;

    if-eqz v1, :cond_a

    new-instance v0, LD2/h;

    invoke-direct {v0, v3, v13, v1, v4}, LD2/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    invoke-virtual {v12, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_5

    :cond_a
    new-instance v1, La1/e;

    invoke-direct {v1, v4, v15}, La1/e;-><init>(ILjava/lang/Object;)V

    sget-object v3, La1/g;->c:Ljava/lang/Object;

    monitor-enter v3

    :try_start_3
    sget-object v2, La1/g;->d:Ln/F;

    invoke-virtual {v2, v9}, Ln/F;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    if-eqz v4, :cond_b

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit v3

    goto :goto_9

    :catchall_0
    move-exception v0

    goto :goto_a

    :cond_b
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2, v9, v4}, Ln/F;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    new-instance v11, La1/d;

    const/4 v6, 0x1

    move-object v1, v11

    move-object v2, v9

    move-object/from16 v3, p0

    move-object v4, v14

    move/from16 v5, p6

    invoke-direct/range {v1 .. v6}, La1/d;-><init>(Ljava/lang/String;Landroid/content/Context;La1/c;II)V

    sget-object v0, La1/g;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v1, La1/e;

    invoke-direct {v1, v8, v9}, La1/e;-><init>(ILjava/lang/Object;)V

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    if-nez v2, :cond_c

    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    goto :goto_8

    :cond_c
    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    :goto_8
    new-instance v3, La1/k;

    invoke-direct {v3}, La1/k;-><init>()V

    iput-object v11, v3, La1/k;->e:Ljava/lang/Object;

    iput-object v1, v3, La1/k;->f:Ljava/lang/Object;

    iput-object v2, v3, La1/k;->g:Ljava/lang/Object;

    invoke-virtual {v0, v3}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    :goto_9
    move-object/from16 v4, p2

    goto :goto_b

    :goto_a
    :try_start_4
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0

    :cond_d
    sget-object v3, LV0/g;->a:La/a;

    check-cast v1, LU0/f;

    move-object/from16 v4, p2

    invoke-virtual {v3, v0, v1, v4, v7}, La/a;->r(Landroid/content/Context;LU0/f;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;

    move-result-object v10

    if-eqz v2, :cond_f

    if-eqz v10, :cond_e

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, LR/b;

    invoke-direct {v1, v2, v8, v10}, LR/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_b

    :cond_e
    invoke-virtual {v2, v9}, LU0/b;->a(I)V

    :cond_f
    :goto_b
    if-eqz v10, :cond_10

    sget-object v0, LV0/g;->b:Ln/o;

    invoke-static/range {p2 .. p6}, LV0/g;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v10}, Ln/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_10
    return-object v10
.end method

.method public static b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x2d

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
