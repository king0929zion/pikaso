.class public final Landroidx/lifecycle/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public b:Lm/a;

.field public c:Landroidx/lifecycle/m;

.field public final d:Ljava/lang/ref/WeakReference;

.field public e:I

.field public f:Z

.field public g:Z

.field public final h:Ljava/util/ArrayList;

.field public final i:LB2/G;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/r;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/t;->a:Z

    new-instance v0, Lm/a;

    invoke-direct {v0}, Lm/a;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/t;->b:Lm/a;

    sget-object v0, Landroidx/lifecycle/m;->e:Landroidx/lifecycle/m;

    iput-object v0, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Landroidx/lifecycle/t;->h:Ljava/util/ArrayList;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Landroidx/lifecycle/t;->d:Ljava/lang/ref/WeakReference;

    new-instance p1, LB2/G;

    invoke-direct {p1, v0}, LB2/G;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Landroidx/lifecycle/t;->i:LB2/G;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/q;)V
    .locals 9

    iget-object v0, p0, Landroidx/lifecycle/t;->h:Ljava/util/ArrayList;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-string v3, "observer"

    invoke-static {p1, v3}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "addObserver"

    invoke-virtual {p0, v3}, Landroidx/lifecycle/t;->c(Ljava/lang/String;)V

    iget-object v3, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    sget-object v4, Landroidx/lifecycle/m;->d:Landroidx/lifecycle/m;

    if-ne v3, v4, :cond_0

    goto :goto_0

    :cond_0
    sget-object v4, Landroidx/lifecycle/m;->e:Landroidx/lifecycle/m;

    :goto_0
    new-instance v3, Landroidx/lifecycle/s;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    sget-object v5, Landroidx/lifecycle/u;->a:Ljava/util/HashMap;

    instance-of v5, p1, Landroidx/lifecycle/p;

    instance-of v6, p1, Landroidx/lifecycle/d;

    const/4 v7, 0x0

    if-eqz v5, :cond_1

    if-eqz v6, :cond_1

    new-instance v5, Landroidx/lifecycle/f;

    move-object v6, p1

    check-cast v6, Landroidx/lifecycle/d;

    move-object v8, p1

    check-cast v8, Landroidx/lifecycle/p;

    invoke-direct {v5, v6, v8}, Landroidx/lifecycle/f;-><init>(Landroidx/lifecycle/d;Landroidx/lifecycle/p;)V

    goto :goto_1

    :cond_1
    if-eqz v6, :cond_2

    new-instance v5, Landroidx/lifecycle/f;

    move-object v6, p1

    check-cast v6, Landroidx/lifecycle/d;

    invoke-direct {v5, v6, v1}, Landroidx/lifecycle/f;-><init>(Landroidx/lifecycle/d;Landroidx/lifecycle/p;)V

    goto :goto_1

    :cond_2
    if-eqz v5, :cond_3

    move-object v5, p1

    check-cast v5, Landroidx/lifecycle/p;

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-static {v5}, Landroidx/lifecycle/u;->c(Ljava/lang/Class;)I

    move-result v6

    const/4 v8, 0x2

    if-ne v6, v8, :cond_6

    sget-object v6, Landroidx/lifecycle/u;->b:Ljava/util/HashMap;

    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lp2/g;->b(Ljava/lang/Object;)V

    check-cast v5, Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    if-eq v6, v2, :cond_5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    new-array v8, v6, [Landroidx/lifecycle/h;

    if-gtz v6, :cond_4

    new-instance v5, LA1/a;

    invoke-direct {v5, v2, v8}, LA1/a;-><init>(ILjava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Constructor;

    invoke-static {v0, p1}, Landroidx/lifecycle/u;->a(Ljava/lang/reflect/Constructor;Landroidx/lifecycle/q;)V

    throw v1

    :cond_5
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Constructor;

    invoke-static {v0, p1}, Landroidx/lifecycle/u;->a(Ljava/lang/reflect/Constructor;Landroidx/lifecycle/q;)V

    throw v1

    :cond_6
    new-instance v5, Landroidx/lifecycle/f;

    invoke-direct {v5, p1}, Landroidx/lifecycle/f;-><init>(Landroidx/lifecycle/q;)V

    :goto_1
    iput-object v5, v3, Landroidx/lifecycle/s;->b:Landroidx/lifecycle/p;

    iput-object v4, v3, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    iget-object v4, p0, Landroidx/lifecycle/t;->b:Lm/a;

    invoke-virtual {v4, p1}, Lm/a;->a(Ljava/lang/Object;)Lm/c;

    move-result-object v5

    if-eqz v5, :cond_7

    iget-object v1, v5, Lm/c;->e:Ljava/lang/Object;

    goto :goto_3

    :cond_7
    iget-object v5, v4, Lm/a;->h:Ljava/util/HashMap;

    new-instance v6, Lm/c;

    invoke-direct {v6, p1, v3}, Lm/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget v8, v4, Lm/f;->g:I

    add-int/2addr v8, v2

    iput v8, v4, Lm/f;->g:I

    iget-object v8, v4, Lm/f;->e:Lm/c;

    if-nez v8, :cond_8

    iput-object v6, v4, Lm/f;->d:Lm/c;

    iput-object v6, v4, Lm/f;->e:Lm/c;

    goto :goto_2

    :cond_8
    iput-object v6, v8, Lm/c;->f:Lm/c;

    iput-object v8, v6, Lm/c;->g:Lm/c;

    iput-object v6, v4, Lm/f;->e:Lm/c;

    :goto_2
    invoke-virtual {v5, p1, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_3
    check-cast v1, Landroidx/lifecycle/s;

    if-eqz v1, :cond_9

    return-void

    :cond_9
    iget-object v1, p0, Landroidx/lifecycle/t;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/r;

    if-nez v1, :cond_a

    return-void

    :cond_a
    iget v4, p0, Landroidx/lifecycle/t;->e:I

    if-nez v4, :cond_b

    iget-boolean v4, p0, Landroidx/lifecycle/t;->f:Z

    if-eqz v4, :cond_c

    :cond_b
    move v7, v2

    :cond_c
    invoke-virtual {p0, p1}, Landroidx/lifecycle/t;->b(Landroidx/lifecycle/q;)Landroidx/lifecycle/m;

    move-result-object v4

    iget v5, p0, Landroidx/lifecycle/t;->e:I

    add-int/2addr v5, v2

    iput v5, p0, Landroidx/lifecycle/t;->e:I

    :goto_4
    iget-object v5, v3, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    invoke-virtual {v5, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v4

    if-gez v4, :cond_e

    iget-object v4, p0, Landroidx/lifecycle/t;->b:Lm/a;

    iget-object v4, v4, Lm/a;->h:Ljava/util/HashMap;

    invoke-virtual {v4, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e

    iget-object v4, v3, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v4, Landroidx/lifecycle/l;->Companion:Landroidx/lifecycle/j;

    iget-object v5, v3, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5}, Landroidx/lifecycle/j;->a(Landroidx/lifecycle/m;)Landroidx/lifecycle/l;

    move-result-object v4

    if-eqz v4, :cond_d

    invoke-virtual {v3, v1, v4}, Landroidx/lifecycle/s;->a(Landroidx/lifecycle/r;Landroidx/lifecycle/l;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    sub-int/2addr v4, v2

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    invoke-virtual {p0, p1}, Landroidx/lifecycle/t;->b(Landroidx/lifecycle/q;)Landroidx/lifecycle/m;

    move-result-object v4

    goto :goto_4

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "no event up from "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v3, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    if-nez v7, :cond_f

    invoke-virtual {p0}, Landroidx/lifecycle/t;->g()V

    :cond_f
    iget p1, p0, Landroidx/lifecycle/t;->e:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Landroidx/lifecycle/t;->e:I

    return-void
.end method

.method public final b(Landroidx/lifecycle/q;)Landroidx/lifecycle/m;
    .locals 3

    iget-object v0, p0, Landroidx/lifecycle/t;->b:Lm/a;

    iget-object v0, v0, Lm/a;->h:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm/c;

    iget-object p1, p1, Lm/c;->g:Lm/c;

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    if-eqz p1, :cond_1

    iget-object p1, p1, Lm/c;->e:Ljava/lang/Object;

    check-cast p1, Landroidx/lifecycle/s;

    iget-object p1, p1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    goto :goto_1

    :cond_1
    move-object p1, v2

    :goto_1
    iget-object v0, p0, Landroidx/lifecycle/t;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroidx/lifecycle/m;

    :cond_2
    iget-object v0, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    const-string v1, "state1"

    invoke-static {v0, v1}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_3

    invoke-virtual {p1, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-gez v1, :cond_3

    goto :goto_2

    :cond_3
    move-object p1, v0

    :goto_2
    if-eqz v2, :cond_4

    invoke-virtual {v2, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-gez v0, :cond_4

    goto :goto_3

    :cond_4
    move-object v2, p1

    :goto_3
    return-object v2
.end method

.method public final c(Ljava/lang/String;)V
    .locals 3

    iget-boolean v0, p0, Landroidx/lifecycle/t;->a:Z

    if-eqz v0, :cond_3

    sget-object v0, Ll/a;->b:Ll/a;

    if-eqz v0, :cond_0

    sget-object v0, Ll/a;->b:Ll/a;

    goto :goto_1

    :cond_0
    const-class v0, Ll/a;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ll/a;->b:Ll/a;

    if-nez v1, :cond_1

    new-instance v1, Ll/a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/a;-><init>(I)V

    sput-object v1, Ll/a;->b:Ll/a;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Ll/a;->b:Ll/a;

    :goto_1
    iget-object v0, v0, Ll/a;->a:Ljava/lang/Object;

    check-cast v0, Ll/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_2

    goto :goto_3

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Method "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " must be called on the main thread"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_3
    :goto_3
    return-void
.end method

.method public final d(Landroidx/lifecycle/l;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handleLifecycleEvent"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/t;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/lifecycle/l;->a()Landroidx/lifecycle/m;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/lifecycle/t;->e(Landroidx/lifecycle/m;)V

    return-void
.end method

.method public final e(Landroidx/lifecycle/m;)V
    .locals 3

    iget-object v0, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    sget-object v1, Landroidx/lifecycle/m;->e:Landroidx/lifecycle/m;

    sget-object v2, Landroidx/lifecycle/m;->d:Landroidx/lifecycle/m;

    if-ne v0, v1, :cond_2

    if-eq p1, v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "State must be at least CREATED to move to "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", but was "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " in component "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Landroidx/lifecycle/t;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    iput-object p1, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    iget-boolean p1, p0, Landroidx/lifecycle/t;->f:Z

    const/4 v0, 0x1

    if-nez p1, :cond_5

    iget p1, p0, Landroidx/lifecycle/t;->e:I

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    iput-boolean v0, p0, Landroidx/lifecycle/t;->f:Z

    invoke-virtual {p0}, Landroidx/lifecycle/t;->g()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/lifecycle/t;->f:Z

    iget-object p1, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    if-ne p1, v2, :cond_4

    new-instance p1, Lm/a;

    invoke-direct {p1}, Lm/a;-><init>()V

    iput-object p1, p0, Landroidx/lifecycle/t;->b:Lm/a;

    :cond_4
    return-void

    :cond_5
    :goto_1
    iput-boolean v0, p0, Landroidx/lifecycle/t;->g:Z

    return-void
.end method

.method public final f(Landroidx/lifecycle/q;)V
    .locals 1

    const-string v0, "observer"

    invoke-static {p1, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "removeObserver"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/t;->c(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/t;->b:Lm/a;

    invoke-virtual {v0, p1}, Lm/a;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final g()V
    .locals 8

    iget-object v0, p0, Landroidx/lifecycle/t;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/r;

    if-eqz v0, :cond_c

    :cond_0
    iget-object v1, p0, Landroidx/lifecycle/t;->b:Lm/a;

    iget v2, v1, Lm/f;->g:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, v1, Lm/f;->d:Lm/c;

    invoke-static {v1}, Lp2/g;->b(Ljava/lang/Object;)V

    iget-object v1, v1, Lm/c;->e:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/s;

    iget-object v1, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    iget-object v2, p0, Landroidx/lifecycle/t;->b:Lm/a;

    iget-object v2, v2, Lm/f;->e:Lm/c;

    invoke-static {v2}, Lp2/g;->b(Ljava/lang/Object;)V

    iget-object v2, v2, Lm/c;->e:Ljava/lang/Object;

    check-cast v2, Landroidx/lifecycle/s;

    iget-object v2, v2, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    if-ne v1, v2, :cond_3

    iget-object v1, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    if-ne v1, v2, :cond_3

    :goto_0
    iput-boolean v4, p0, Landroidx/lifecycle/t;->g:Z

    iget-object v0, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    iget-object v1, p0, Landroidx/lifecycle/t;->i:LB2/G;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v0, :cond_2

    sget-object v0, LC2/c;->b:LD2/w;

    :cond_2
    invoke-virtual {v1, v3, v0}, LB2/G;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :cond_3
    iput-boolean v4, p0, Landroidx/lifecycle/t;->g:Z

    iget-object v1, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    iget-object v2, p0, Landroidx/lifecycle/t;->b:Lm/a;

    iget-object v2, v2, Lm/f;->d:Lm/c;

    invoke-static {v2}, Lp2/g;->b(Ljava/lang/Object;)V

    iget-object v2, v2, Lm/c;->e:Ljava/lang/Object;

    check-cast v2, Landroidx/lifecycle/s;

    iget-object v2, v2, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-gez v1, :cond_9

    iget-object v1, p0, Landroidx/lifecycle/t;->b:Lm/a;

    new-instance v2, Lm/b;

    iget-object v4, v1, Lm/f;->e:Lm/c;

    iget-object v5, v1, Lm/f;->d:Lm/c;

    const/4 v6, 0x1

    invoke-direct {v2, v4, v5, v6}, Lm/b;-><init>(Lm/c;Lm/c;I)V

    iget-object v1, v1, Lm/f;->f:Ljava/util/WeakHashMap;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v4}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    invoke-virtual {v2}, Lm/b;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    iget-boolean v1, p0, Landroidx/lifecycle/t;->g:Z

    if-nez v1, :cond_9

    invoke-virtual {v2}, Lm/b;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    const-string v4, "next()"

    invoke-static {v1, v4}, Lp2/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/lifecycle/q;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/s;

    :goto_1
    iget-object v5, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    iget-object v6, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    invoke-virtual {v5, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v5

    if-lez v5, :cond_4

    iget-boolean v5, p0, Landroidx/lifecycle/t;->g:Z

    if-nez v5, :cond_4

    iget-object v5, p0, Landroidx/lifecycle/t;->b:Lm/a;

    iget-object v5, v5, Lm/a;->h:Ljava/util/HashMap;

    invoke-virtual {v5, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    sget-object v5, Landroidx/lifecycle/l;->Companion:Landroidx/lifecycle/j;

    iget-object v6, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v5, "state"

    invoke-static {v6, v5}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    const/4 v6, 0x2

    if-eq v5, v6, :cond_7

    const/4 v6, 0x3

    if-eq v5, v6, :cond_6

    const/4 v6, 0x4

    if-eq v5, v6, :cond_5

    move-object v5, v3

    goto :goto_2

    :cond_5
    sget-object v5, Landroidx/lifecycle/l;->ON_PAUSE:Landroidx/lifecycle/l;

    goto :goto_2

    :cond_6
    sget-object v5, Landroidx/lifecycle/l;->ON_STOP:Landroidx/lifecycle/l;

    goto :goto_2

    :cond_7
    sget-object v5, Landroidx/lifecycle/l;->ON_DESTROY:Landroidx/lifecycle/l;

    :goto_2
    if-eqz v5, :cond_8

    invoke-virtual {v5}, Landroidx/lifecycle/l;->a()Landroidx/lifecycle/m;

    move-result-object v6

    iget-object v7, p0, Landroidx/lifecycle/t;->h:Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v0, v5}, Landroidx/lifecycle/s;->a(Landroidx/lifecycle/r;Landroidx/lifecycle/l;)V

    iget-object v5, p0, Landroidx/lifecycle/t;->h:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "no event down from "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    iget-object v1, p0, Landroidx/lifecycle/t;->b:Lm/a;

    iget-object v1, v1, Lm/f;->e:Lm/c;

    iget-boolean v2, p0, Landroidx/lifecycle/t;->g:Z

    if-nez v2, :cond_0

    if-eqz v1, :cond_0

    iget-object v2, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    iget-object v1, v1, Lm/c;->e:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/s;

    iget-object v1, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    invoke-virtual {v2, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Landroidx/lifecycle/t;->b:Lm/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lm/d;

    invoke-direct {v2, v1}, Lm/d;-><init>(Lm/f;)V

    iget-object v1, v1, Lm/f;->f:Ljava/util/WeakHashMap;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    invoke-virtual {v2}, Lm/d;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Landroidx/lifecycle/t;->g:Z

    if-nez v1, :cond_0

    invoke-virtual {v2}, Lm/d;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/lifecycle/q;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/s;

    :goto_3
    iget-object v4, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    iget-object v5, p0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    invoke-virtual {v4, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v4

    if-gez v4, :cond_a

    iget-boolean v4, p0, Landroidx/lifecycle/t;->g:Z

    if-nez v4, :cond_a

    iget-object v4, p0, Landroidx/lifecycle/t;->b:Lm/a;

    iget-object v4, v4, Lm/a;->h:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a

    iget-object v4, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    iget-object v5, p0, Landroidx/lifecycle/t;->h:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v4, Landroidx/lifecycle/l;->Companion:Landroidx/lifecycle/j;

    iget-object v5, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5}, Landroidx/lifecycle/j;->a(Landroidx/lifecycle/m;)Landroidx/lifecycle/l;

    move-result-object v4

    if-eqz v4, :cond_b

    invoke-virtual {v1, v0, v4}, Landroidx/lifecycle/s;->a(Landroidx/lifecycle/r;Landroidx/lifecycle/l;)V

    iget-object v4, p0, Landroidx/lifecycle/t;->h:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_3

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "no event up from "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, Landroidx/lifecycle/s;->a:Landroidx/lifecycle/m;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
