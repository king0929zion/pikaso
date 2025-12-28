.class public final Lp/x;
.super Li2/j;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# instance fields
.field public h:LG2/a;

.field public i:Ljava/lang/Object;

.field public j:Lp/y;

.field public k:I

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:I

.field public final synthetic n:Lp/y;

.field public final synthetic o:Li2/j;


# direct methods
.method public constructor <init>(ILp/y;Lo2/c;Lg2/d;)V
    .locals 0

    iput p1, p0, Lp/x;->m:I

    iput-object p2, p0, Lp/x;->n:Lp/y;

    check-cast p3, Li2/j;

    iput-object p3, p0, Lp/x;->o:Li2/j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Li2/j;-><init>(ILg2/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lg2/d;Ljava/lang/Object;)Lg2/d;
    .locals 4

    new-instance v0, Lp/x;

    iget-object v1, p0, Lp/x;->o:Li2/j;

    iget v2, p0, Lp/x;->m:I

    iget-object v3, p0, Lp/x;->n:Lp/y;

    invoke-direct {v0, v2, v3, v1, p1}, Lp/x;-><init>(ILp/y;Lo2/c;Lg2/d;)V

    iput-object p2, v0, Lp/x;->l:Ljava/lang/Object;

    return-object v0
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly2/u;

    check-cast p2, Lg2/d;

    invoke-virtual {p0, p2, p1}, Lp/x;->f(Lg2/d;Ljava/lang/Object;)Lg2/d;

    move-result-object p1

    check-cast p1, Lp/x;

    sget-object p2, Lc2/m;->a:Lc2/m;

    invoke-virtual {p1, p2}, Lp/x;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lh2/a;->d:Lh2/a;

    iget v1, p0, Lp/x;->k:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lp/x;->i:Ljava/lang/Object;

    check-cast v0, Lp/y;

    iget-object v1, p0, Lp/x;->h:LG2/a;

    iget-object v2, p0, Lp/x;->l:Ljava/lang/Object;

    check-cast v2, Lp/w;

    :try_start_0
    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception p1

    goto/16 :goto_6

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lp/x;->j:Lp/y;

    iget-object v3, p0, Lp/x;->i:Ljava/lang/Object;

    check-cast v3, Lo2/c;

    iget-object v5, p0, Lp/x;->h:LG2/a;

    iget-object v6, p0, Lp/x;->l:Ljava/lang/Object;

    check-cast v6, Lp/w;

    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    move-object p1, v1

    :goto_0
    move-object v1, v5

    goto :goto_3

    :cond_2
    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    iget-object p1, p0, Lp/x;->l:Ljava/lang/Object;

    check-cast p1, Ly2/u;

    new-instance v1, Lp/w;

    invoke-interface {p1}, Ly2/u;->m()Lg2/i;

    move-result-object p1

    sget-object v5, Ly2/s;->e:Ly2/s;

    invoke-interface {p1, v5}, Lg2/i;->n(Lg2/h;)Lg2/g;

    move-result-object p1

    invoke-static {p1}, Lp2/g;->b(Ljava/lang/Object;)V

    check-cast p1, Ly2/S;

    iget v5, p0, Lp/x;->m:I

    invoke-direct {v1, v5, p1}, Lp/w;-><init>(ILy2/S;)V

    :goto_1
    iget-object p1, p0, Lp/x;->n:Lp/y;

    iget-object v5, p1, Lp/y;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lp/w;

    if-eqz v6, :cond_5

    iget v7, v1, Lp/w;->a:I

    iget v8, v6, Lp/w;->a:I

    if-eqz v7, :cond_4

    if-eqz v8, :cond_4

    sub-int/2addr v7, v8

    if-ltz v7, :cond_3

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/util/concurrent/CancellationException;

    const-string v0, "Current mutation had a higher priority"

    invoke-direct {p1, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    const/4 p1, 0x0

    throw p1

    :cond_5
    :goto_2
    invoke-virtual {v5, v6, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_c

    if-eqz v6, :cond_6

    new-instance v5, LC2/o;

    const-string v7, "Mutation interrupted"

    const/4 v8, 0x4

    invoke-direct {v5, v7, v8}, LC2/o;-><init>(Ljava/lang/String;I)V

    iget-object v6, v6, Lp/w;->b:Ly2/S;

    invoke-interface {v6, v5}, Ly2/S;->a(Ljava/util/concurrent/CancellationException;)V

    :cond_6
    iput-object v1, p0, Lp/x;->l:Ljava/lang/Object;

    iget-object v5, p1, Lp/y;->b:LG2/d;

    iput-object v5, p0, Lp/x;->h:LG2/a;

    iget-object v6, p0, Lp/x;->o:Li2/j;

    iput-object v6, p0, Lp/x;->i:Ljava/lang/Object;

    iput-object p1, p0, Lp/x;->j:Lp/y;

    iput v3, p0, Lp/x;->k:I

    invoke-virtual {v5, v4, p0}, LG2/d;->c(Ljava/lang/Object;Li2/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_7

    return-object v0

    :cond_7
    move-object v3, v6

    move-object v6, v1

    goto :goto_0

    :goto_3
    :try_start_1
    iput-object v6, p0, Lp/x;->l:Ljava/lang/Object;

    iput-object v1, p0, Lp/x;->h:LG2/a;

    iput-object p1, p0, Lp/x;->i:Ljava/lang/Object;

    iput-object v4, p0, Lp/x;->j:Lp/y;

    iput v2, p0, Lp/x;->k:I

    invoke-interface {v3, p0}, Lo2/c;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v2, v0, :cond_8

    return-object v0

    :cond_8
    move-object v0, p1

    move-object p1, v2

    move-object v2, v6

    :goto_4
    :try_start_2
    iget-object v0, v0, Lp/y;->a:Ljava/util/concurrent/atomic/AtomicReference;

    :cond_9
    invoke-virtual {v0, v2, v4}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_5

    :cond_a
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eq v3, v2, :cond_9

    :goto_5
    check-cast v1, LG2/d;

    invoke-virtual {v1, v4}, LG2/d;->d(Ljava/lang/Object;)V

    return-object p1

    :catchall_1
    move-exception v0

    move-object v2, v6

    move-object v9, v0

    move-object v0, p1

    move-object p1, v9

    :goto_6
    :try_start_3
    iget-object v0, v0, Lp/y;->a:Ljava/util/concurrent/atomic/AtomicReference;

    :goto_7
    invoke-virtual {v0, v2, v4}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_b

    goto :goto_7

    :cond_b
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception p1

    check-cast v1, LG2/d;

    invoke-virtual {v1, v4}, LG2/d;->d(Ljava/lang/Object;)V

    throw p1

    :cond_c
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v7

    if-eq v7, v6, :cond_5

    goto/16 :goto_1
.end method
