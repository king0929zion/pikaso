.class public abstract Ly2/I;
.super Ly2/J;
.source "SourceFile"

# interfaces
.implements Ly2/y;


# static fields
.field public static final j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final l:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile _delayed:Ljava/lang/Object;

.field private volatile _isCompleted:I

.field private volatile _queue:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "_queue"

    const-class v1, Ly2/I;

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ly2/I;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_delayed"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ly2/I;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_isCompleted"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Ly2/I;->l:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ly2/r;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Ly2/I;->_isCompleted:I

    return-void
.end method


# virtual methods
.method public A(Ljava/lang/Runnable;)V
    .locals 1

    invoke-virtual {p0, p1}, Ly2/I;->B(Ljava/lang/Runnable;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ly2/J;->o()Ljava/lang/Thread;

    move-result-object p1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    if-eq v0, p1, :cond_1

    invoke-static {p1}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    goto :goto_0

    :cond_0
    sget-object v0, Ly2/w;->m:Ly2/w;

    invoke-virtual {v0, p1}, Ly2/w;->A(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final B(Ljava/lang/Runnable;)Z
    .locals 6

    :goto_0
    sget-object v0, Ly2/I;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Ly2/I;->l:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    move v2, v4

    goto :goto_1

    :cond_0
    move v2, v3

    :goto_1
    if-eqz v2, :cond_1

    return v3

    :cond_1
    if-nez v1, :cond_4

    :cond_2
    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    return v4

    :cond_3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_4
    instance-of v2, v1, LD2/n;

    if-eqz v2, :cond_a

    move-object v2, v1

    check-cast v2, LD2/n;

    invoke-virtual {v2, p1}, LD2/n;->a(Ljava/lang/Runnable;)I

    move-result v5

    if-eqz v5, :cond_9

    if-eq v5, v4, :cond_6

    const/4 v0, 0x2

    if-eq v5, v0, :cond_5

    goto :goto_0

    :cond_5
    return v3

    :cond_6
    invoke-virtual {v2}, LD2/n;->c()LD2/n;

    move-result-object v2

    :cond_7
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_0

    :cond_8
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v1, :cond_7

    goto :goto_0

    :cond_9
    return v4

    :cond_a
    sget-object v2, Ly2/v;->c:LD2/w;

    if-ne v1, v2, :cond_b

    return v3

    :cond_b
    new-instance v2, LD2/n;

    const/16 v3, 0x8

    invoke-direct {v2, v3, v4}, LD2/n;-><init>(IZ)V

    move-object v3, v1

    check-cast v3, Ljava/lang/Runnable;

    invoke-virtual {v2, v3}, LD2/n;->a(Ljava/lang/Runnable;)I

    invoke-virtual {v2, p1}, LD2/n;->a(Ljava/lang/Runnable;)I

    :cond_c
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_d

    return v4

    :cond_d
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v1, :cond_c

    goto :goto_0
.end method

.method public final C()Z
    .locals 7

    iget-object v0, p0, Ly2/J;->h:Ld2/i;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ld2/i;->isEmpty()Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    sget-object v0, Ly2/I;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly2/H;

    if-eqz v0, :cond_3

    sget-object v3, LD2/z;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    return v2

    :cond_3
    :goto_1
    sget-object v0, Ly2/I;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    instance-of v3, v0, LD2/n;

    if-eqz v3, :cond_5

    check-cast v0, LD2/n;

    sget-object v3, LD2/n;->f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v3

    const-wide/32 v5, 0x3fffffff

    and-long/2addr v5, v3

    long-to-int v0, v5

    const-wide v5, 0xfffffffc0000000L

    and-long/2addr v3, v5

    const/16 v5, 0x1e

    shr-long/2addr v3, v5

    long-to-int v3, v3

    if-ne v0, v3, :cond_6

    goto :goto_2

    :cond_5
    sget-object v3, Ly2/v;->c:LD2/w;

    if-ne v0, v3, :cond_6

    goto :goto_2

    :cond_6
    move v1, v2

    :goto_2
    return v1
.end method

.method public final D(JLy2/G;)V
    .locals 6

    sget-object v0, Ly2/I;->l:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    sget-object v3, Ly2/I;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v4, 0x0

    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_2

    :cond_1
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly2/H;

    if-nez v0, :cond_4

    new-instance v5, Ly2/H;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    iput-wide p1, v5, Ly2/H;->c:J

    :cond_2
    invoke-virtual {v3, p0, v4, v5}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    :goto_1
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lp2/g;->b(Ljava/lang/Object;)V

    check-cast v0, Ly2/H;

    :cond_4
    invoke-virtual {p3, p1, p2, v0, p0}, Ly2/G;->a(JLy2/H;Ly2/I;)I

    move-result v0

    :goto_2
    if-eqz v0, :cond_7

    if-eq v0, v2, :cond_6

    const/4 p1, 0x2

    if-ne v0, p1, :cond_5

    goto :goto_4

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "unexpected result"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    invoke-virtual {p0, p1, p2, p3}, Ly2/J;->y(JLy2/G;)V

    goto :goto_4

    :cond_7
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly2/H;

    if-eqz p1, :cond_9

    monitor-enter p1

    :try_start_0
    iget-object p2, p1, LD2/z;->a:[Ly2/G;

    if-eqz p2, :cond_8

    aget-object v4, p2, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_8
    monitor-exit p1

    goto :goto_3

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2

    :cond_9
    :goto_3
    if-ne v4, p3, :cond_a

    invoke-virtual {p0}, Ly2/J;->o()Ljava/lang/Thread;

    move-result-object p1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p2

    if-eq p2, p1, :cond_a

    invoke-static {p1}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_a
    :goto_4
    return-void
.end method

.method public final c(JLy2/f;)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gtz v2, :cond_0

    goto :goto_0

    :cond_0
    const-wide v0, 0x8637bd05af6L

    cmp-long v0, p1, v0

    if-ltz v0, :cond_1

    const-wide v0, 0x7fffffffffffffffL

    goto :goto_0

    :cond_1
    const-wide/32 v0, 0xf4240

    mul-long/2addr v0, p1

    :goto_0
    const-wide p1, 0x3fffffffffffffffL    # 1.9999999999999998

    cmp-long p1, v0, p1

    if-gez p1, :cond_2

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide p1

    new-instance v2, Ly2/F;

    add-long/2addr v0, p1

    invoke-direct {v2, p0, v0, v1, p3}, Ly2/F;-><init>(Ly2/I;JLy2/f;)V

    invoke-virtual {p0, p1, p2, v2}, Ly2/I;->D(JLy2/G;)V

    new-instance p1, Ly2/D;

    const/4 p2, 0x0

    invoke-direct {p1, p2, v2}, Ly2/D;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p3, p1}, Ly2/f;->x(Lo2/c;)V

    :cond_2
    return-void
.end method

.method public final d(Lg2/i;Ljava/lang/Runnable;)V
    .locals 0

    invoke-virtual {p0, p2}, Ly2/I;->A(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final w()J
    .locals 11

    invoke-virtual {p0}, Ly2/J;->x()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    return-wide v1

    :cond_0
    sget-object v0, Ly2/I;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly2/H;

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v0, :cond_7

    sget-object v5, LD2/z;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v5, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v5

    if-nez v5, :cond_1

    goto :goto_5

    :cond_1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v5

    :cond_2
    monitor-enter v0

    :try_start_0
    iget-object v7, v0, LD2/z;->a:[Ly2/G;

    if-eqz v7, :cond_3

    aget-object v7, v7, v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_3
    move-object v7, v3

    :goto_0
    if-nez v7, :cond_4

    monitor-exit v0

    move-object v7, v3

    goto :goto_3

    :cond_4
    :try_start_1
    iget-wide v8, v7, Ly2/G;->d:J

    sub-long v8, v5, v8

    cmp-long v8, v8, v1

    if-ltz v8, :cond_5

    invoke-virtual {p0, v7}, Ly2/I;->B(Ljava/lang/Runnable;)Z

    move-result v7

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_4

    :cond_5
    move v7, v4

    :goto_1
    if-eqz v7, :cond_6

    invoke-virtual {v0, v4}, LD2/z;->b(I)Ly2/G;

    move-result-object v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :cond_6
    move-object v7, v3

    :goto_2
    monitor-exit v0

    :goto_3
    if-nez v7, :cond_2

    goto :goto_5

    :goto_4
    monitor-exit v0

    throw v1

    :cond_7
    :goto_5
    sget-object v0, Ly2/I;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_8

    :goto_6
    move-object v7, v3

    goto :goto_7

    :cond_8
    instance-of v6, v5, LD2/n;

    if-eqz v6, :cond_c

    move-object v6, v5

    check-cast v6, LD2/n;

    invoke-virtual {v6}, LD2/n;->d()Ljava/lang/Object;

    move-result-object v7

    sget-object v8, LD2/n;->g:LD2/w;

    if-eq v7, v8, :cond_9

    check-cast v7, Ljava/lang/Runnable;

    goto :goto_7

    :cond_9
    invoke-virtual {v6}, LD2/n;->c()LD2/n;

    move-result-object v6

    :cond_a
    invoke-virtual {v0, p0, v5, v6}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_b

    goto :goto_5

    :cond_b
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-eq v7, v5, :cond_a

    goto :goto_5

    :cond_c
    sget-object v6, Ly2/v;->c:LD2/w;

    if-ne v5, v6, :cond_d

    goto :goto_6

    :cond_d
    invoke-virtual {v0, p0, v5, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1a

    move-object v7, v5

    check-cast v7, Ljava/lang/Runnable;

    :goto_7
    if-eqz v7, :cond_e

    invoke-interface {v7}, Ljava/lang/Runnable;->run()V

    return-wide v1

    :cond_e
    iget-object v0, p0, Ly2/J;->h:Ld2/i;

    const-wide v5, 0x7fffffffffffffffL

    if-nez v0, :cond_f

    :goto_8
    move-wide v7, v5

    goto :goto_9

    :cond_f
    invoke-virtual {v0}, Ld2/i;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_10

    goto :goto_8

    :cond_10
    move-wide v7, v1

    :goto_9
    cmp-long v0, v7, v1

    if-nez v0, :cond_11

    goto :goto_c

    :cond_11
    sget-object v0, Ly2/I;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_15

    instance-of v7, v0, LD2/n;

    if-eqz v7, :cond_13

    check-cast v0, LD2/n;

    sget-object v7, LD2/n;->f:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual {v7, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v7

    const-wide/32 v9, 0x3fffffff

    and-long/2addr v9, v7

    long-to-int v0, v9

    const-wide v9, 0xfffffffc0000000L

    and-long/2addr v7, v9

    const/16 v9, 0x1e

    shr-long/2addr v7, v9

    long-to-int v7, v7

    if-ne v0, v7, :cond_12

    const/4 v0, 0x1

    goto :goto_a

    :cond_12
    move v0, v4

    :goto_a
    if-nez v0, :cond_15

    goto :goto_c

    :cond_13
    sget-object v3, Ly2/v;->c:LD2/w;

    if-ne v0, v3, :cond_19

    :cond_14
    :goto_b
    move-wide v1, v5

    goto :goto_c

    :cond_15
    sget-object v0, Ly2/I;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly2/H;

    if-eqz v0, :cond_14

    monitor-enter v0

    :try_start_2
    iget-object v7, v0, LD2/z;->a:[Ly2/G;

    if-eqz v7, :cond_16

    aget-object v3, v7, v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_16
    monitor-exit v0

    if-nez v3, :cond_17

    goto :goto_b

    :cond_17
    iget-wide v3, v3, Ly2/G;->d:J

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v5

    sub-long/2addr v3, v5

    cmp-long v0, v3, v1

    if-gez v0, :cond_18

    goto :goto_c

    :cond_18
    move-wide v1, v3

    goto :goto_c

    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1

    :cond_19
    :goto_c
    return-wide v1

    :cond_1a
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-eq v6, v5, :cond_d

    goto/16 :goto_5
.end method

.method public z()V
    .locals 6

    sget-object v0, Ly2/k0;->a:Ljava/lang/ThreadLocal;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    sget-object v0, Ly2/I;->l:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v2, 0x1

    invoke-virtual {v0, p0, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->set(Ljava/lang/Object;I)V

    :goto_0
    sget-object v0, Ly2/I;->j:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Ly2/v;->c:LD2/w;

    if-nez v3, :cond_2

    :cond_0
    invoke-virtual {v0, p0, v1, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_2
    instance-of v5, v3, LD2/n;

    if-eqz v5, :cond_3

    check-cast v3, LD2/n;

    invoke-virtual {v3}, LD2/n;->b()Z

    goto :goto_1

    :cond_3
    if-ne v3, v4, :cond_4

    goto :goto_1

    :cond_4
    new-instance v4, LD2/n;

    const/16 v5, 0x8

    invoke-direct {v4, v5, v2}, LD2/n;-><init>(IZ)V

    move-object v5, v3

    check-cast v5, Ljava/lang/Runnable;

    invoke-virtual {v4, v5}, LD2/n;->a(Ljava/lang/Runnable;)I

    :cond_5
    invoke-virtual {v0, p0, v3, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    :cond_6
    :goto_1
    invoke-virtual {p0}, Ly2/I;->w()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-lez v0, :cond_6

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    :goto_2
    sget-object v0, Ly2/I;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly2/H;

    if-eqz v0, :cond_9

    monitor-enter v0

    :try_start_0
    sget-object v4, LD2/z;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v4, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v4

    if-lez v4, :cond_7

    const/4 v4, 0x0

    invoke-virtual {v0, v4}, LD2/z;->b(I)Ly2/G;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v1

    goto :goto_4

    :cond_7
    move-object v4, v1

    :goto_3
    monitor-exit v0

    if-nez v4, :cond_8

    goto :goto_5

    :cond_8
    invoke-virtual {p0, v2, v3, v4}, Ly2/J;->y(JLy2/G;)V

    goto :goto_2

    :goto_4
    monitor-exit v0

    throw v1

    :cond_9
    :goto_5
    return-void

    :cond_a
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eq v5, v3, :cond_5

    goto :goto_0
.end method
