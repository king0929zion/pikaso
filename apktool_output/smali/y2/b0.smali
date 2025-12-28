.class public Ly2/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/S;
.implements Ly2/g0;


# static fields
.field public static final d:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile _parentHandle:Ljava/lang/Object;

.field private volatile _state:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "_state"

    const-class v1, Ly2/b0;

    const-class v2, Ljava/lang/Object;

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ly2/b0;->d:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_parentHandle"

    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ly2/b0;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    sget-object p1, Ly2/v;->j:Ly2/E;

    goto :goto_0

    :cond_0
    sget-object p1, Ly2/v;->i:Ly2/E;

    :goto_0
    iput-object p1, p0, Ly2/b0;->_state:Ljava/lang/Object;

    return-void
.end method

.method public static S(LD2/k;)Ly2/j;
    .locals 2

    :goto_0
    invoke-virtual {p0}, LD2/k;->n()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, LD2/k;->j()LD2/k;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object v1, LD2/k;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LD2/k;

    :goto_1
    invoke-virtual {p0}, LD2/k;->n()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LD2/k;

    goto :goto_1

    :cond_1
    move-object p0, v0

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, LD2/k;->m()LD2/k;

    move-result-object p0

    invoke-virtual {p0}, LD2/k;->n()Z

    move-result v0

    if-nez v0, :cond_2

    instance-of v0, p0, Ly2/j;

    if-eqz v0, :cond_3

    check-cast p0, Ly2/j;

    return-object p0

    :cond_3
    instance-of v0, p0, Ly2/d0;

    if-eqz v0, :cond_2

    const/4 p0, 0x0

    return-object p0
.end method

.method public static Y(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    instance-of v0, p0, Ly2/Z;

    const-string v1, "Active"

    if-eqz v0, :cond_1

    check-cast p0, Ly2/Z;

    invoke-virtual {p0}, Ly2/Z;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v1, "Cancelling"

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ly2/Z;->e()Z

    move-result p0

    if-eqz p0, :cond_5

    const-string v1, "Completing"

    goto :goto_0

    :cond_1
    instance-of v0, p0, Ly2/N;

    if-eqz v0, :cond_3

    check-cast p0, Ly2/N;

    invoke-interface {p0}, Ly2/N;->b()Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_0

    :cond_2
    const-string v1, "New"

    goto :goto_0

    :cond_3
    instance-of p0, p0, Ly2/m;

    if-eqz p0, :cond_4

    const-string v1, "Cancelled"

    goto :goto_0

    :cond_4
    const-string v1, "Completed"

    :cond_5
    :goto_0
    return-object v1
.end method


# virtual methods
.method public final A(Ljava/lang/Object;)Z
    .locals 9

    sget-object v0, Ly2/v;->d:LD2/w;

    invoke-virtual {p0}, Ly2/b0;->K()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    :cond_0
    invoke-virtual {p0}, Ly2/b0;->M()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ly2/N;

    if-eqz v1, :cond_2

    instance-of v1, v0, Ly2/Z;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Ly2/Z;

    invoke-virtual {v1}, Ly2/Z;->e()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Ly2/m;

    invoke-virtual {p0, p1}, Ly2/b0;->G(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    invoke-direct {v1, v4, v2}, Ly2/m;-><init>(Ljava/lang/Throwable;Z)V

    invoke-virtual {p0, v0, v1}, Ly2/b0;->Z(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ly2/v;->f:LD2/w;

    if-eq v0, v1, :cond_0

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v0, Ly2/v;->d:LD2/w;

    :goto_1
    sget-object v1, Ly2/v;->e:LD2/w;

    if-ne v0, v1, :cond_3

    return v3

    :cond_3
    sget-object v1, Ly2/v;->d:LD2/w;

    if-ne v0, v1, :cond_12

    const/4 v0, 0x0

    move-object v1, v0

    :cond_4
    :goto_2
    invoke-virtual {p0}, Ly2/b0;->M()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ly2/Z;

    if-eqz v5, :cond_a

    monitor-enter v4

    :try_start_0
    move-object v5, v4

    check-cast v5, Ly2/Z;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, Ly2/Z;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v6, v5}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Ly2/v;->h:LD2/w;

    if-ne v5, v6, :cond_5

    move v5, v3

    goto :goto_3

    :cond_5
    move v5, v2

    :goto_3
    if-eqz v5, :cond_6

    sget-object p1, Ly2/v;->g:LD2/w;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v4

    :goto_4
    move-object v0, p1

    goto/16 :goto_7

    :cond_6
    :try_start_1
    move-object v5, v4

    check-cast v5, Ly2/Z;

    invoke-virtual {v5}, Ly2/Z;->d()Z

    move-result v5

    if-nez v1, :cond_7

    invoke-virtual {p0, p1}, Ly2/b0;->G(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    goto :goto_5

    :catchall_0
    move-exception p1

    goto :goto_6

    :cond_7
    :goto_5
    move-object p1, v4

    check-cast p1, Ly2/Z;

    invoke-virtual {p1, v1}, Ly2/Z;->a(Ljava/lang/Throwable;)V

    move-object p1, v4

    check-cast p1, Ly2/Z;

    invoke-virtual {p1}, Ly2/Z;->c()Ljava/lang/Throwable;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v5, :cond_8

    move-object v0, p1

    :cond_8
    monitor-exit v4

    if-eqz v0, :cond_9

    check-cast v4, Ly2/Z;

    iget-object p1, v4, Ly2/Z;->d:Ly2/d0;

    invoke-virtual {p0, p1, v0}, Ly2/b0;->T(Ly2/d0;Ljava/lang/Throwable;)V

    :cond_9
    sget-object p1, Ly2/v;->d:LD2/w;

    goto :goto_4

    :goto_6
    monitor-exit v4

    throw p1

    :cond_a
    instance-of v5, v4, Ly2/N;

    if-eqz v5, :cond_11

    if-nez v1, :cond_b

    invoke-virtual {p0, p1}, Ly2/b0;->G(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    :cond_b
    move-object v5, v4

    check-cast v5, Ly2/N;

    invoke-interface {v5}, Ly2/N;->b()Z

    move-result v6

    if-eqz v6, :cond_f

    invoke-virtual {p0, v5}, Ly2/b0;->L(Ly2/N;)Ly2/d0;

    move-result-object v6

    if-nez v6, :cond_c

    goto :goto_2

    :cond_c
    new-instance v7, Ly2/Z;

    invoke-direct {v7, v6, v1}, Ly2/Z;-><init>(Ly2/d0;Ljava/lang/Throwable;)V

    :cond_d
    sget-object v4, Ly2/b0;->d:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v4, p0, v5, v7}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_e

    invoke-virtual {p0, v6, v1}, Ly2/b0;->T(Ly2/d0;Ljava/lang/Throwable;)V

    sget-object p1, Ly2/v;->d:LD2/w;

    goto :goto_4

    :cond_e
    invoke-virtual {v4, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eq v4, v5, :cond_d

    goto/16 :goto_2

    :cond_f
    new-instance v5, Ly2/m;

    invoke-direct {v5, v1, v2}, Ly2/m;-><init>(Ljava/lang/Throwable;Z)V

    invoke-virtual {p0, v4, v5}, Ly2/b0;->Z(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Ly2/v;->d:LD2/w;

    if-eq v5, v6, :cond_10

    sget-object v4, Ly2/v;->f:LD2/w;

    if-eq v5, v4, :cond_4

    move-object v0, v5

    goto :goto_7

    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot happen in "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_11
    sget-object p1, Ly2/v;->g:LD2/w;

    goto/16 :goto_4

    :cond_12
    :goto_7
    sget-object p1, Ly2/v;->d:LD2/w;

    if-ne v0, p1, :cond_13

    :goto_8
    move v2, v3

    goto :goto_9

    :cond_13
    sget-object p1, Ly2/v;->e:LD2/w;

    if-ne v0, p1, :cond_14

    goto :goto_8

    :cond_14
    sget-object p1, Ly2/v;->g:LD2/w;

    if-ne v0, p1, :cond_15

    goto :goto_9

    :cond_15
    invoke-virtual {p0, v0}, Ly2/b0;->y(Ljava/lang/Object;)V

    goto :goto_8

    :goto_9
    return v2
.end method

.method public B(Ljava/util/concurrent/CancellationException;)V
    .locals 0

    invoke-virtual {p0, p1}, Ly2/b0;->A(Ljava/lang/Object;)Z

    return-void
.end method

.method public final C(Ljava/lang/Throwable;)Z
    .locals 4

    invoke-virtual {p0}, Ly2/b0;->Q()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    sget-object v2, Ly2/b0;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly2/i;

    if-eqz v2, :cond_4

    sget-object v3, Ly2/e0;->d:Ly2/e0;

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v2, p1}, Ly2/i;->f(Ljava/lang/Throwable;)Z

    move-result p1

    if-nez p1, :cond_3

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :cond_3
    :goto_0
    return v1

    :cond_4
    :goto_1
    return v0
.end method

.method public D()Ljava/lang/String;
    .locals 1

    const-string v0, "Job was cancelled"

    return-object v0
.end method

.method public E(Ljava/lang/Throwable;)Z
    .locals 2

    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, p1}, Ly2/b0;->A(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Ly2/b0;->J()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final F(Ly2/N;Ljava/lang/Object;)V
    .locals 7

    sget-object v0, Ly2/b0;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly2/i;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ly2/C;->d()V

    sget-object v1, Ly2/e0;->d:Ly2/e0;

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    instance-of v0, p2, Ly2/m;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p2, Ly2/m;

    goto :goto_0

    :cond_1
    move-object p2, v1

    :goto_0
    if-eqz p2, :cond_2

    iget-object p2, p2, Ly2/m;->a:Ljava/lang/Throwable;

    goto :goto_1

    :cond_2
    move-object p2, v1

    :goto_1
    instance-of v0, p1, Ly2/W;

    const-string v2, " for "

    const-string v3, "Exception in completion handler "

    if-eqz v0, :cond_3

    :try_start_0
    move-object v0, p1

    check-cast v0, Ly2/W;

    invoke-virtual {v0, p2}, Ly2/W;->p(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception p2

    new-instance v0, LB1/c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0}, Ly2/b0;->O(LB1/c;)V

    goto :goto_4

    :cond_3
    invoke-interface {p1}, Ly2/N;->g()Ly2/d0;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1}, LD2/k;->l()Ljava/lang/Object;

    move-result-object v0

    const-string v4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"

    invoke-static {v0, v4}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LD2/k;

    :goto_2
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    instance-of v4, v0, Ly2/W;

    if-eqz v4, :cond_5

    move-object v4, v0

    check-cast v4, Ly2/W;

    :try_start_1
    invoke-virtual {v4, p2}, Ly2/W;->p(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v5

    if-eqz v1, :cond_4

    invoke-static {v1, v5}, LZ0/d;->f(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_4
    new-instance v1, LB1/c;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4, v5}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    :goto_3
    invoke-virtual {v0}, LD2/k;->m()LD2/k;

    move-result-object v0

    goto :goto_2

    :cond_6
    if-eqz v1, :cond_7

    invoke-virtual {p0, v1}, Ly2/b0;->O(LB1/c;)V

    :cond_7
    :goto_4
    return-void
.end method

.method public final G(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 4

    instance-of v0, p1, Ljava/lang/Throwable;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/Throwable;

    goto :goto_1

    :cond_0
    check-cast p1, Ly2/g0;

    check-cast p1, Ly2/b0;

    invoke-virtual {p1}, Ly2/b0;->M()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ly2/Z;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Ly2/Z;

    invoke-virtual {v1}, Ly2/Z;->c()Ljava/lang/Throwable;

    move-result-object v1

    goto :goto_0

    :cond_1
    instance-of v1, v0, Ly2/m;

    if-eqz v1, :cond_2

    move-object v1, v0

    check-cast v1, Ly2/m;

    iget-object v1, v1, Ly2/m;->a:Ljava/lang/Throwable;

    goto :goto_0

    :cond_2
    instance-of v1, v0, Ly2/N;

    if-nez v1, :cond_5

    move-object v1, v2

    :goto_0
    instance-of v3, v1, Ljava/util/concurrent/CancellationException;

    if-eqz v3, :cond_3

    move-object v2, v1

    check-cast v2, Ljava/util/concurrent/CancellationException;

    :cond_3
    if-nez v2, :cond_4

    new-instance v2, Ly2/T;

    invoke-static {v0}, Ly2/b0;->Y(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "Parent job is "

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1, p1}, Ly2/T;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ly2/b0;)V

    :cond_4
    move-object p1, v2

    :goto_1
    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot be cancelling child in this state: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final H(Ly2/Z;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Ly2/m;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ly2/m;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, v0, Ly2/m;->a:Ljava/lang/Throwable;

    :cond_1
    monitor-enter p1

    :try_start_0
    invoke-virtual {p1}, Ly2/Z;->d()Z

    invoke-virtual {p1, v1}, Ly2/Z;->f(Ljava/lang/Throwable;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Ly2/b0;->I(Ly2/Z;Ljava/util/ArrayList;)Ljava/lang/Throwable;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-gt v4, v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    new-instance v5, Ljava/util/IdentityHashMap;

    invoke-direct {v5, v4}, Ljava/util/IdentityHashMap;-><init>(I)V

    invoke-static {v5}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v4

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Throwable;

    if-eq v5, v2, :cond_3

    if-eq v5, v2, :cond_3

    instance-of v6, v5, Ljava/util/concurrent/CancellationException;

    if-nez v6, :cond_3

    invoke-interface {v4, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v2, v5}, LZ0/d;->f(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_4
    :goto_2
    monitor-exit p1

    const/4 v0, 0x0

    if-nez v2, :cond_5

    goto :goto_3

    :cond_5
    if-ne v2, v1, :cond_6

    goto :goto_3

    :cond_6
    new-instance p2, Ly2/m;

    invoke-direct {p2, v2, v0}, Ly2/m;-><init>(Ljava/lang/Throwable;Z)V

    :goto_3
    if-eqz v2, :cond_8

    invoke-virtual {p0, v2}, Ly2/b0;->C(Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_7

    invoke-virtual {p0, v2}, Ly2/b0;->N(Ljava/lang/Throwable;)Z

    move-result v1

    if-eqz v1, :cond_8

    :cond_7
    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"

    invoke-static {p2, v1}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p2

    check-cast v1, Ly2/m;

    sget-object v2, Ly2/m;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v2, v1, v0, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    :cond_8
    invoke-virtual {p0, p2}, Ly2/b0;->U(Ljava/lang/Object;)V

    sget-object v0, Ly2/b0;->d:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    instance-of v1, p2, Ly2/N;

    if-eqz v1, :cond_9

    new-instance v1, Ly2/O;

    move-object v2, p2

    check-cast v2, Ly2/N;

    invoke-direct {v1, v2}, Ly2/O;-><init>(Ly2/N;)V

    goto :goto_4

    :cond_9
    move-object v1, p2

    :cond_a
    :goto_4
    invoke-virtual {v0, p0, p1, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    goto :goto_5

    :cond_b
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, p1, :cond_a

    :goto_5
    invoke-virtual {p0, p1, p2}, Ly2/b0;->F(Ly2/N;Ljava/lang/Object;)V

    return-object p2

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2
.end method

.method public final I(Ly2/Z;Ljava/util/ArrayList;)Ljava/lang/Throwable;
    .locals 3

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ly2/Z;->d()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ly2/T;

    invoke-virtual {p0}, Ly2/b0;->D()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, v1, p0}, Ly2/T;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ly2/b0;)V

    return-object p1

    :cond_0
    return-object v1

    :cond_1
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Throwable;

    instance-of v2, v2, Ljava/util/concurrent/CancellationException;

    if-nez v2, :cond_2

    goto :goto_0

    :cond_3
    move-object v0, v1

    :goto_0
    check-cast v0, Ljava/lang/Throwable;

    if-eqz v0, :cond_4

    return-object v0

    :cond_4
    const/4 p1, 0x0

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    instance-of v0, p1, Ly2/l0;

    if-eqz v0, :cond_7

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Throwable;

    if-eq v2, p1, :cond_5

    instance-of v2, v2, Ly2/l0;

    if-eqz v2, :cond_5

    move-object v1, v0

    :cond_6
    check-cast v1, Ljava/lang/Throwable;

    if-eqz v1, :cond_7

    return-object v1

    :cond_7
    return-object p1
.end method

.method public J()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public K()Z
    .locals 1

    instance-of v0, p0, Ly2/k;

    return v0
.end method

.method public final L(Ly2/N;)Ly2/d0;
    .locals 3

    invoke-interface {p1}, Ly2/N;->g()Ly2/d0;

    move-result-object v0

    if-nez v0, :cond_2

    instance-of v0, p1, Ly2/E;

    if-eqz v0, :cond_0

    new-instance v0, Ly2/d0;

    invoke-direct {v0}, LD2/k;-><init>()V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ly2/W;

    if-eqz v0, :cond_1

    check-cast p1, Ly2/W;

    invoke-virtual {p0, p1}, Ly2/b0;->W(Ly2/W;)V

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "State should have list: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    return-object v0
.end method

.method public final M()Ljava/lang/Object;
    .locals 2

    :goto_0
    sget-object v0, Ly2/b0;->d:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LD2/q;

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    check-cast v0, LD2/q;

    invoke-virtual {v0, p0}, LD2/q;->a(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public N(Ljava/lang/Throwable;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public O(LB1/c;)V
    .locals 0

    throw p1
.end method

.method public final P(Ly2/S;)V
    .locals 3

    sget-object v0, Ly2/e0;->d:Ly2/e0;

    sget-object v1, Ly2/b0;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    if-nez p1, :cond_0

    invoke-virtual {v1, p0, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-interface {p1}, Ly2/S;->h()Z

    invoke-interface {p1, p0}, Ly2/S;->s(Ly2/b0;)Ly2/i;

    move-result-object p1

    invoke-virtual {v1, p0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Ly2/b0;->M()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Ly2/N;

    if-nez v2, :cond_1

    invoke-interface {p1}, Ly2/C;->d()V

    invoke-virtual {v1, p0, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public Q()Z
    .locals 1

    instance-of v0, p0, Ly2/c;

    return v0
.end method

.method public final R(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    :cond_0
    invoke-virtual {p0}, Ly2/b0;->M()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Ly2/b0;->Z(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ly2/v;->d:LD2/w;

    if-ne v0, v1, :cond_3

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Job "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is already complete or completing, but is being completed with "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    instance-of v2, p1, Ly2/m;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    check-cast p1, Ly2/m;

    goto :goto_0

    :cond_1
    move-object p1, v3

    :goto_0
    if-eqz p1, :cond_2

    iget-object v3, p1, Ly2/m;->a:Ljava/lang/Throwable;

    :cond_2
    invoke-direct {v0, v1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_3
    sget-object v1, Ly2/v;->f:LD2/w;

    if-eq v0, v1, :cond_0

    return-object v0
.end method

.method public final T(Ly2/d0;Ljava/lang/Throwable;)V
    .locals 6

    invoke-virtual {p1}, LD2/k;->l()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"

    invoke-static {v0, v1}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LD2/k;

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    instance-of v2, v0, Ly2/U;

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, Ly2/W;

    :try_start_0
    invoke-virtual {v2, p2}, Ly2/W;->p(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v3

    if-eqz v1, :cond_0

    invoke-static {v1, v3}, LZ0/d;->f(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_0
    new-instance v1, LB1/c;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Exception in completion handler "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " for "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    invoke-virtual {v0}, LD2/k;->m()LD2/k;

    move-result-object v0

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {p0, v1}, Ly2/b0;->O(LB1/c;)V

    :cond_3
    invoke-virtual {p0, p2}, Ly2/b0;->C(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public U(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public V()V
    .locals 0

    return-void
.end method

.method public final W(Ly2/W;)V
    .locals 3

    new-instance v0, Ly2/d0;

    invoke-direct {v0}, LD2/k;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, LD2/k;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, LD2/k;->d:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {p1}, LD2/k;->l()Ljava/lang/Object;

    move-result-object v2

    if-eq v2, p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v1, p1, p1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0, p1}, LD2/k;->k(LD2/k;)V

    :goto_1
    invoke-virtual {p1}, LD2/k;->m()LD2/k;

    move-result-object v2

    :cond_1
    sget-object v0, Ly2/b0;->d:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0, p1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p1, :cond_1

    :goto_2
    return-void

    :cond_3
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, p1, :cond_0

    goto :goto_0
.end method

.method public final X(Ljava/lang/Object;)I
    .locals 5

    instance-of v0, p1, Ly2/E;

    const/4 v1, 0x1

    const/4 v2, -0x1

    sget-object v3, Ly2/b0;->d:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v4, 0x0

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Ly2/E;

    iget-boolean v0, v0, Ly2/E;->d:Z

    if-eqz v0, :cond_0

    return v4

    :cond_0
    sget-object v0, Ly2/v;->j:Ly2/E;

    :cond_1
    invoke-virtual {v3, p0, p1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {p0}, Ly2/b0;->V()V

    return v1

    :cond_2
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eq v4, p1, :cond_1

    return v2

    :cond_3
    instance-of v0, p1, Ly2/M;

    if-eqz v0, :cond_6

    move-object v0, p1

    check-cast v0, Ly2/M;

    iget-object v0, v0, Ly2/M;->d:Ly2/d0;

    :cond_4
    invoke-virtual {v3, p0, p1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {p0}, Ly2/b0;->V()V

    return v1

    :cond_5
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eq v4, p1, :cond_4

    return v2

    :cond_6
    return v4
.end method

.method public final Z(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p1, Ly2/N;

    if-nez v0, :cond_0

    sget-object p1, Ly2/v;->d:LD2/w;

    return-object p1

    :cond_0
    instance-of v0, p1, Ly2/E;

    if-nez v0, :cond_1

    instance-of v0, p1, Ly2/W;

    if-eqz v0, :cond_5

    :cond_1
    instance-of v0, p1, Ly2/j;

    if-nez v0, :cond_5

    instance-of v0, p2, Ly2/m;

    if-nez v0, :cond_5

    move-object v0, p1

    check-cast v0, Ly2/N;

    instance-of p1, p2, Ly2/N;

    if-eqz p1, :cond_2

    new-instance p1, Ly2/O;

    move-object v1, p2

    check-cast v1, Ly2/N;

    invoke-direct {p1, v1}, Ly2/O;-><init>(Ly2/N;)V

    move-object v1, p1

    goto :goto_0

    :cond_2
    move-object v1, p2

    :cond_3
    :goto_0
    sget-object p1, Ly2/b0;->d:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {p1, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0, p2}, Ly2/b0;->U(Ljava/lang/Object;)V

    invoke-virtual {p0, v0, p2}, Ly2/b0;->F(Ly2/N;Ljava/lang/Object;)V

    return-object p2

    :cond_4
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eq p1, v0, :cond_3

    sget-object p1, Ly2/v;->f:LD2/w;

    return-object p1

    :cond_5
    check-cast p1, Ly2/N;

    invoke-virtual {p0, p1}, Ly2/b0;->L(Ly2/N;)Ly2/d0;

    move-result-object v0

    if-nez v0, :cond_6

    sget-object p1, Ly2/v;->f:LD2/w;

    goto/16 :goto_7

    :cond_6
    instance-of v1, p1, Ly2/Z;

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    move-object v1, p1

    check-cast v1, Ly2/Z;

    goto :goto_1

    :cond_7
    move-object v1, v2

    :goto_1
    if-nez v1, :cond_8

    new-instance v1, Ly2/Z;

    invoke-direct {v1, v0, v2}, Ly2/Z;-><init>(Ly2/d0;Ljava/lang/Throwable;)V

    :cond_8
    monitor-enter v1

    :try_start_0
    invoke-virtual {v1}, Ly2/Z;->e()Z

    move-result v3

    if-eqz v3, :cond_9

    sget-object p1, Ly2/v;->d:LD2/w;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    goto/16 :goto_7

    :cond_9
    :try_start_1
    sget-object v3, Ly2/Z;->e:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v4, 0x1

    invoke-virtual {v3, v1, v4}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->set(Ljava/lang/Object;I)V

    if-eq v1, p1, :cond_c

    sget-object v3, Ly2/b0;->d:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_a
    invoke-virtual {v3, p0, p1, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    goto :goto_2

    :cond_b
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eq v5, p1, :cond_a

    sget-object p1, Ly2/v;->f:LD2/w;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    goto :goto_7

    :catchall_0
    move-exception p1

    goto :goto_8

    :cond_c
    :goto_2
    :try_start_2
    invoke-virtual {v1}, Ly2/Z;->d()Z

    move-result v3

    instance-of v5, p2, Ly2/m;

    if-eqz v5, :cond_d

    move-object v5, p2

    check-cast v5, Ly2/m;

    goto :goto_3

    :cond_d
    move-object v5, v2

    :goto_3
    if-eqz v5, :cond_e

    iget-object v5, v5, Ly2/m;->a:Ljava/lang/Throwable;

    invoke-virtual {v1, v5}, Ly2/Z;->a(Ljava/lang/Throwable;)V

    :cond_e
    invoke-virtual {v1}, Ly2/Z;->c()Ljava/lang/Throwable;

    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v3, :cond_f

    goto :goto_4

    :cond_f
    move-object v5, v2

    :goto_4
    monitor-exit v1

    if-eqz v5, :cond_10

    invoke-virtual {p0, v0, v5}, Ly2/b0;->T(Ly2/d0;Ljava/lang/Throwable;)V

    :cond_10
    instance-of v0, p1, Ly2/j;

    if-eqz v0, :cond_11

    move-object v0, p1

    check-cast v0, Ly2/j;

    goto :goto_5

    :cond_11
    move-object v0, v2

    :goto_5
    if-nez v0, :cond_12

    invoke-interface {p1}, Ly2/N;->g()Ly2/d0;

    move-result-object p1

    if-eqz p1, :cond_13

    invoke-static {p1}, Ly2/b0;->S(LD2/k;)Ly2/j;

    move-result-object v2

    goto :goto_6

    :cond_12
    move-object v2, v0

    :cond_13
    :goto_6
    if-eqz v2, :cond_16

    :cond_14
    iget-object p1, v2, Ly2/j;->h:Ly2/b0;

    new-instance v0, Ly2/Y;

    invoke-direct {v0, p0, v1, v2, p2}, Ly2/Y;-><init>(Ly2/b0;Ly2/Z;Ly2/j;Ljava/lang/Object;)V

    const/4 v3, 0x0

    invoke-static {p1, v3, v0, v4}, Ly2/v;->i(Ly2/S;ZLy2/W;I)Ly2/C;

    move-result-object p1

    sget-object v0, Ly2/e0;->d:Ly2/e0;

    if-eq p1, v0, :cond_15

    sget-object p1, Ly2/v;->e:LD2/w;

    goto :goto_7

    :cond_15
    invoke-static {v2}, Ly2/b0;->S(LD2/k;)Ly2/j;

    move-result-object v2

    if-nez v2, :cond_14

    :cond_16
    invoke-virtual {p0, v1, p2}, Ly2/b0;->H(Ly2/Z;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_7
    return-object p1

    :goto_8
    monitor-exit v1

    throw p1
.end method

.method public a(Ljava/util/concurrent/CancellationException;)V
    .locals 2

    if-nez p1, :cond_0

    new-instance p1, Ly2/T;

    invoke-virtual {p0}, Ly2/b0;->D()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1, p0}, Ly2/T;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ly2/b0;)V

    :cond_0
    invoke-virtual {p0, p1}, Ly2/b0;->B(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public b()Z
    .locals 2

    invoke-virtual {p0}, Ly2/b0;->M()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ly2/N;

    if-eqz v1, :cond_0

    check-cast v0, Ly2/N;

    invoke-interface {v0}, Ly2/N;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final e(Lg2/h;)Lg2/i;
    .locals 0

    invoke-static {p0, p1}, LZ0/d;->H(Lg2/g;Lg2/h;)Lg2/i;

    move-result-object p1

    return-object p1
.end method

.method public final f()Ljava/util/concurrent/CancellationException;
    .locals 4

    invoke-virtual {p0}, Ly2/b0;->M()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ly2/Z;

    const/4 v2, 0x0

    const-string v3, "Job is still new or active: "

    if-eqz v1, :cond_3

    check-cast v0, Ly2/Z;

    invoke-virtual {v0}, Ly2/Z;->c()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const-string v3, " is cancelling"

    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    instance-of v3, v0, Ljava/util/concurrent/CancellationException;

    if-eqz v3, :cond_0

    move-object v2, v0

    check-cast v2, Ljava/util/concurrent/CancellationException;

    :cond_0
    if-nez v2, :cond_6

    new-instance v2, Ly2/T;

    if-nez v1, :cond_1

    invoke-virtual {p0}, Ly2/b0;->D()Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-direct {v2, v1, v0, p0}, Ly2/T;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ly2/b0;)V

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    instance-of v1, v0, Ly2/N;

    if-nez v1, :cond_7

    instance-of v1, v0, Ly2/m;

    if-eqz v1, :cond_5

    check-cast v0, Ly2/m;

    iget-object v0, v0, Ly2/m;->a:Ljava/lang/Throwable;

    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    if-eqz v1, :cond_4

    move-object v2, v0

    check-cast v2, Ljava/util/concurrent/CancellationException;

    :cond_4
    if-nez v2, :cond_6

    new-instance v1, Ly2/T;

    invoke-virtual {p0}, Ly2/b0;->D()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0, p0}, Ly2/T;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ly2/b0;)V

    move-object v2, v1

    goto :goto_0

    :cond_5
    new-instance v0, Ly2/T;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const-string v3, " has completed normally"

    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v2, p0}, Ly2/T;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ly2/b0;)V

    move-object v2, v0

    :cond_6
    :goto_0
    return-object v2

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getKey()Lg2/h;
    .locals 1

    sget-object v0, Ly2/s;->e:Ly2/s;

    return-object v0
.end method

.method public final getParent()Ly2/S;
    .locals 1

    sget-object v0, Ly2/b0;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly2/i;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ly2/i;->getParent()Ly2/S;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final h()Z
    .locals 2

    :goto_0
    invoke-virtual {p0}, Ly2/b0;->M()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Ly2/b0;->X(Ljava/lang/Object;)I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final i(Lg2/i;)Lg2/i;
    .locals 0

    invoke-static {p0, p1}, LZ0/d;->K(Lg2/g;Lg2/i;)Lg2/i;

    move-result-object p1

    return-object p1
.end method

.method public final k(Li2/c;)Ljava/lang/Object;
    .locals 4

    :cond_0
    invoke-virtual {p0}, Ly2/b0;->M()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ly2/N;

    sget-object v2, Lc2/m;->a:Lc2/m;

    if-nez v1, :cond_1

    invoke-interface {p1}, Lg2/d;->o()Lg2/i;

    move-result-object p1

    invoke-static {p1}, Ly2/v;->d(Lg2/i;)V

    return-object v2

    :cond_1
    invoke-virtual {p0, v0}, Ly2/b0;->X(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    new-instance v0, Ly2/f;

    invoke-static {p1}, LZ/b;->z(Lg2/d;)Lg2/d;

    move-result-object p1

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Ly2/f;-><init>(ILg2/d;)V

    invoke-virtual {v0}, Ly2/f;->u()V

    new-instance p1, Ly2/Q;

    const/4 v3, 0x2

    invoke-direct {p1, v3, v0}, Ly2/Q;-><init>(ILjava/lang/Object;)V

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v1, p1}, Ly2/b0;->v(ZZLo2/c;)Ly2/C;

    move-result-object p1

    new-instance v1, Ly2/D;

    const/4 v3, 0x0

    invoke-direct {v1, v3, p1}, Ly2/D;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Ly2/f;->x(Lo2/c;)V

    invoke-virtual {v0}, Ly2/f;->s()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lh2/a;->d:Lh2/a;

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_2
    move-object p1, v2

    :goto_0
    if-ne p1, v0, :cond_3

    return-object p1

    :cond_3
    return-object v2
.end method

.method public final l(Ljava/lang/Object;Lo2/e;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p2, p1, p0}, Lo2/e;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final n(Lg2/h;)Lg2/g;
    .locals 0

    invoke-static {p0, p1}, LZ0/d;->w(Lg2/g;Lg2/h;)Lg2/g;

    move-result-object p1

    return-object p1
.end method

.method public final q(Lo2/c;)Ly2/C;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1, p1}, Ly2/b0;->v(ZZLo2/c;)Ly2/C;

    move-result-object p1

    return-object p1
.end method

.method public final s(Ly2/b0;)Ly2/i;
    .locals 2

    new-instance v0, Ly2/j;

    invoke-direct {v0, p1}, Ly2/j;-><init>(Ly2/b0;)V

    const/4 p1, 0x2

    const/4 v1, 0x1

    invoke-static {p0, v1, v0, p1}, Ly2/v;->i(Ly2/S;ZLy2/W;I)Ly2/C;

    move-result-object p1

    check-cast p1, Ly2/i;

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x7b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ly2/b0;->M()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ly2/b0;->Y(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x7d

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ly2/v;->f(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final v(ZZLo2/c;)Ly2/C;
    .locals 7

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    instance-of v1, p3, Ly2/U;

    if-eqz v1, :cond_0

    move-object v1, p3

    check-cast v1, Ly2/U;

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-nez v1, :cond_4

    new-instance v1, Ly2/P;

    invoke-direct {v1, p3}, Ly2/P;-><init>(Lo2/c;)V

    goto :goto_2

    :cond_1
    instance-of v1, p3, Ly2/W;

    if-eqz v1, :cond_2

    move-object v1, p3

    check-cast v1, Ly2/W;

    goto :goto_1

    :cond_2
    move-object v1, v0

    :goto_1
    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    new-instance v1, Ly2/Q;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p3}, Ly2/Q;-><init>(ILjava/lang/Object;)V

    :cond_4
    :goto_2
    iput-object p0, v1, Ly2/W;->g:Ly2/b0;

    :cond_5
    :goto_3
    invoke-virtual {p0}, Ly2/b0;->M()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ly2/E;

    if-eqz v3, :cond_c

    move-object v3, v2

    check-cast v3, Ly2/E;

    iget-boolean v4, v3, Ly2/E;->d:Z

    if-eqz v4, :cond_8

    sget-object v4, Ly2/b0;->d:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_6
    invoke-virtual {v4, p0, v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    return-object v1

    :cond_7
    invoke-virtual {v4, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v2, :cond_6

    goto :goto_3

    :cond_8
    new-instance v2, Ly2/d0;

    invoke-direct {v2}, LD2/k;-><init>()V

    iget-boolean v4, v3, Ly2/E;->d:Z

    if-eqz v4, :cond_9

    move-object v4, v2

    goto :goto_4

    :cond_9
    new-instance v4, Ly2/M;

    invoke-direct {v4, v2}, Ly2/M;-><init>(Ly2/d0;)V

    :cond_a
    :goto_4
    sget-object v2, Ly2/b0;->d:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v2, p0, v3, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    goto :goto_3

    :cond_b
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v3, :cond_a

    goto :goto_3

    :cond_c
    instance-of v3, v2, Ly2/N;

    if-eqz v3, :cond_15

    move-object v3, v2

    check-cast v3, Ly2/N;

    invoke-interface {v3}, Ly2/N;->g()Ly2/d0;

    move-result-object v3

    if-nez v3, :cond_d

    const-string v3, "null cannot be cast to non-null type kotlinx.coroutines.JobNode"

    invoke-static {v2, v3}, Lp2/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ly2/W;

    invoke-virtual {p0, v2}, Ly2/b0;->W(Ly2/W;)V

    goto :goto_3

    :cond_d
    sget-object v4, Ly2/e0;->d:Ly2/e0;

    if-eqz p1, :cond_12

    instance-of v5, v2, Ly2/Z;

    if-eqz v5, :cond_12

    monitor-enter v2

    :try_start_0
    move-object v5, v2

    check-cast v5, Ly2/Z;

    invoke-virtual {v5}, Ly2/Z;->c()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_e

    instance-of v6, p3, Ly2/j;

    if-eqz v6, :cond_11

    move-object v6, v2

    check-cast v6, Ly2/Z;

    invoke-virtual {v6}, Ly2/Z;->e()Z

    move-result v6

    if-nez v6, :cond_11

    goto :goto_5

    :catchall_0
    move-exception p1

    goto :goto_6

    :cond_e
    :goto_5
    move-object v4, v2

    check-cast v4, Ly2/N;

    invoke-virtual {p0, v4, v3, v1}, Ly2/b0;->x(Ly2/N;Ly2/d0;Ly2/W;)Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v4, :cond_f

    monitor-exit v2

    goto/16 :goto_3

    :cond_f
    if-nez v5, :cond_10

    monitor-exit v2

    return-object v1

    :cond_10
    move-object v4, v1

    :cond_11
    monitor-exit v2

    goto :goto_7

    :goto_6
    monitor-exit v2

    throw p1

    :cond_12
    move-object v5, v0

    :goto_7
    if-eqz v5, :cond_14

    if-eqz p2, :cond_13

    invoke-interface {p3, v5}, Lo2/c;->i(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_13
    return-object v4

    :cond_14
    check-cast v2, Ly2/N;

    invoke-virtual {p0, v2, v3, v1}, Ly2/b0;->x(Ly2/N;Ly2/d0;Ly2/W;)Z

    move-result v2

    if-eqz v2, :cond_5

    return-object v1

    :cond_15
    if-eqz p2, :cond_18

    instance-of p1, v2, Ly2/m;

    if-eqz p1, :cond_16

    check-cast v2, Ly2/m;

    goto :goto_8

    :cond_16
    move-object v2, v0

    :goto_8
    if-eqz v2, :cond_17

    iget-object v0, v2, Ly2/m;->a:Ljava/lang/Throwable;

    :cond_17
    invoke-interface {p3, v0}, Lo2/c;->i(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_18
    sget-object p1, Ly2/e0;->d:Ly2/e0;

    return-object p1
.end method

.method public final x(Ly2/N;Ly2/d0;Ly2/W;)Z
    .locals 6

    new-instance v0, Ly2/a0;

    invoke-direct {v0, p3, p0, p1}, Ly2/a0;-><init>(Ly2/W;Ly2/b0;Ly2/N;)V

    :goto_0
    invoke-virtual {p2}, LD2/k;->j()LD2/k;

    move-result-object p1

    if-nez p1, :cond_1

    sget-object v1, LD2/k;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LD2/k;

    :goto_1
    invoke-virtual {p1}, LD2/k;->n()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LD2/k;

    goto :goto_1

    :cond_1
    :goto_2
    sget-object v1, LD2/k;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, p3, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, LD2/k;->d:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, p3, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, v0, Ly2/a0;->c:Ly2/d0;

    :cond_2
    invoke-virtual {v1, p1, p2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    invoke-virtual {v0, p1}, LD2/b;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_3

    move p1, v5

    goto :goto_3

    :cond_3
    move p1, v4

    goto :goto_3

    :cond_4
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, p2, :cond_2

    move p1, v3

    :goto_3
    if-eq p1, v5, :cond_5

    if-eq p1, v4, :cond_6

    goto :goto_0

    :cond_5
    move v3, v5

    :cond_6
    return v3
.end method

.method public y(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public z(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Ly2/b0;->y(Ljava/lang/Object;)V

    return-void
.end method
