.class public final LD/s0;
.super Li2/j;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# instance fields
.field public h:LN/g;

.field public i:I

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:LD/v0;

.field public final synthetic l:LD/u0;

.field public final synthetic m:LD/V;


# direct methods
.method public constructor <init>(LD/v0;LD/u0;LD/V;Lg2/d;)V
    .locals 0

    iput-object p1, p0, LD/s0;->k:LD/v0;

    iput-object p2, p0, LD/s0;->l:LD/u0;

    iput-object p3, p0, LD/s0;->m:LD/V;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Li2/j;-><init>(ILg2/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lg2/d;Ljava/lang/Object;)Lg2/d;
    .locals 4

    new-instance v0, LD/s0;

    iget-object v1, p0, LD/s0;->l:LD/u0;

    iget-object v2, p0, LD/s0;->m:LD/V;

    iget-object v3, p0, LD/s0;->k:LD/v0;

    invoke-direct {v0, v3, v1, v2, p1}, LD/s0;-><init>(LD/v0;LD/u0;LD/V;Lg2/d;)V

    iput-object p2, v0, LD/s0;->j:Ljava/lang/Object;

    return-object v0
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly2/u;

    check-cast p2, Lg2/d;

    invoke-virtual {p0, p2, p1}, LD/s0;->f(Lg2/d;Ljava/lang/Object;)Lg2/d;

    move-result-object p1

    check-cast p1, LD/s0;

    sget-object p2, Lc2/m;->a:Lc2/m;

    invoke-virtual {p1, p2}, LD/s0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    const/4 v0, 0x1

    sget-object v1, Lh2/a;->d:Lh2/a;

    iget v2, p0, LD/s0;->i:I

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    if-ne v2, v0, :cond_0

    iget-object v0, p0, LD/s0;->h:LN/g;

    iget-object v1, p0, LD/s0;->j:Ljava/lang/Object;

    check-cast v1, Ly2/S;

    :try_start_0
    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception p1

    goto/16 :goto_6

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    iget-object p1, p0, LD/s0;->j:Ljava/lang/Object;

    check-cast p1, Ly2/u;

    invoke-interface {p1}, Ly2/u;->m()Lg2/i;

    move-result-object p1

    sget-object v2, Ly2/s;->e:Ly2/s;

    invoke-interface {p1, v2}, Lg2/i;->n(Lg2/h;)Lg2/g;

    move-result-object v2

    check-cast v2, Ly2/S;

    if-eqz v2, :cond_e

    iget-object p1, p0, LD/s0;->k:LD/v0;

    iget-object v4, p1, LD/v0;->b:Ljava/lang/Object;

    monitor-enter v4

    :try_start_1
    iget-object v5, p1, LD/v0;->d:Ljava/lang/Throwable;

    if-nez v5, :cond_d

    iget-object v5, p1, LD/v0;->r:LB2/G;

    invoke-virtual {v5}, LB2/G;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LD/o0;

    sget-object v6, LD/o0;->e:LD/o0;

    invoke-virtual {v5, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v5

    if-lez v5, :cond_c

    iget-object v5, p1, LD/v0;->c:Ly2/S;

    if-nez v5, :cond_b

    iput-object v2, p1, LD/v0;->c:Ly2/S;

    invoke-virtual {p1}, LD/v0;->e()Ly2/e;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    monitor-exit v4

    new-instance p1, LA/i;

    iget-object v4, p0, LD/s0;->k:LD/v0;

    const/4 v5, 0x4

    invoke-direct {p1, v5, v4}, LA/i;-><init>(ILjava/lang/Object;)V

    sget-object v4, LN/o;->a:LB0/a;

    sget-object v4, LN/m;->g:LN/m;

    invoke-static {v4}, LN/o;->f(Lo2/c;)Ljava/lang/Object;

    sget-object v4, LN/o;->b:Ljava/lang/Object;

    monitor-enter v4

    :try_start_2
    sget-object v5, LN/o;->g:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    invoke-static {v5, p1}, Ld2/k;->h0(Ljava/util/List;Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v5

    sput-object v5, LN/o;->g:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    monitor-exit v4

    new-instance v4, LN/g;

    invoke-direct {v4, p1}, LN/g;-><init>(Lo2/e;)V

    sget-object p1, LD/v0;->v:LB2/G;

    iget-object p1, p0, LD/s0;->k:LD/v0;

    iget-object p1, p1, LD/v0;->u:LD/U;

    :cond_2
    sget-object v5, LD/v0;->v:LB2/G;

    invoke-virtual {v5}, LB2/G;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LG/b;

    move-object v7, v6

    check-cast v7, LJ/b;

    iget-object v8, v7, LJ/b;->f:LI/c;

    invoke-virtual {v8, p1}, LI/c;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v7}, Ld2/a;->isEmpty()Z

    move-result v9

    sget-object v10, LK/b;->a:LK/b;

    if-eqz v9, :cond_4

    new-instance v7, LJ/a;

    invoke-direct {v7, v10, v10}, LJ/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, p1, v7}, LI/c;->a(Ljava/lang/Object;LJ/a;)LI/c;

    move-result-object v7

    new-instance v8, LJ/b;

    invoke-direct {v8, p1, p1, v7}, LJ/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;LI/c;)V

    move-object v7, v8

    goto :goto_0

    :cond_4
    iget-object v9, v7, LJ/b;->e:Ljava/lang/Object;

    invoke-virtual {v8, v9}, LI/c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    invoke-static {v11}, Lp2/g;->b(Ljava/lang/Object;)V

    check-cast v11, LJ/a;

    new-instance v12, LJ/a;

    iget-object v11, v11, LJ/a;->a:Ljava/lang/Object;

    invoke-direct {v12, v11, p1}, LJ/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v9, v12}, LI/c;->a(Ljava/lang/Object;LJ/a;)LI/c;

    move-result-object v8

    new-instance v11, LJ/a;

    invoke-direct {v11, v9, v10}, LJ/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, p1, v11}, LI/c;->a(Ljava/lang/Object;LJ/a;)LI/c;

    move-result-object v8

    new-instance v9, LJ/b;

    iget-object v7, v7, LJ/b;->d:Ljava/lang/Object;

    invoke-direct {v9, v7, p1, v8}, LJ/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;LI/c;)V

    move-object v7, v9

    :goto_0
    if-eq v6, v7, :cond_6

    sget-object v8, LC2/c;->b:LD2/w;

    if-nez v6, :cond_5

    move-object v6, v8

    :cond_5
    invoke-virtual {v5, v6, v7}, LB2/G;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    :cond_6
    :try_start_3
    iget-object p1, p0, LD/s0;->k:LD/v0;

    iget-object v5, p1, LD/v0;->b:Ljava/lang/Object;

    monitor-enter v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-virtual {p1}, LD/v0;->h()Ljava/util/List;

    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :try_start_5
    monitor-exit v5

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_7

    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LD/t;

    invoke-virtual {v7}, LD/t;->n()V

    add-int/2addr v6, v0

    goto :goto_1

    :goto_2
    move-object v1, v2

    move-object v0, v4

    goto :goto_6

    :catchall_1
    move-exception p1

    goto :goto_2

    :cond_7
    new-instance p1, LD/r0;

    iget-object v5, p0, LD/s0;->l:LD/u0;

    iget-object v6, p0, LD/s0;->m:LD/V;

    invoke-direct {p1, v5, v6, v3}, LD/r0;-><init>(LD/u0;LD/V;Lg2/d;)V

    iput-object v2, p0, LD/s0;->j:Ljava/lang/Object;

    iput-object v4, p0, LD/s0;->h:LN/g;

    iput v0, p0, LD/s0;->i:I

    invoke-static {p1, p0}, Ly2/v;->b(Lo2/e;Lg2/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    if-ne p1, v1, :cond_8

    return-object v1

    :cond_8
    move-object v1, v2

    move-object v0, v4

    :goto_3
    invoke-virtual {v0}, LN/g;->a()V

    iget-object p1, p0, LD/s0;->k:LD/v0;

    iget-object v0, p1, LD/v0;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_6
    iget-object v2, p1, LD/v0;->c:Ly2/S;

    if-ne v2, v1, :cond_9

    iput-object v3, p1, LD/v0;->c:Ly2/S;

    goto :goto_4

    :catchall_2
    move-exception p1

    goto :goto_5

    :cond_9
    :goto_4
    invoke-virtual {p1}, LD/v0;->e()Ly2/e;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    monitor-exit v0

    sget-object p1, LD/v0;->v:LB2/G;

    iget-object p1, p0, LD/s0;->k:LD/v0;

    iget-object p1, p1, LD/v0;->u:LD/U;

    invoke-static {p1}, LD/U;->b(LD/U;)V

    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1

    :goto_5
    monitor-exit v0

    throw p1

    :catchall_3
    move-exception p1

    :try_start_7
    monitor-exit v5

    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :goto_6
    invoke-virtual {v0}, LN/g;->a()V

    iget-object v0, p0, LD/s0;->k:LD/v0;

    iget-object v2, v0, LD/v0;->b:Ljava/lang/Object;

    monitor-enter v2

    :try_start_8
    iget-object v4, v0, LD/v0;->c:Ly2/S;

    if-ne v4, v1, :cond_a

    iput-object v3, v0, LD/v0;->c:Ly2/S;

    goto :goto_7

    :catchall_4
    move-exception p1

    goto :goto_8

    :cond_a
    :goto_7
    invoke-virtual {v0}, LD/v0;->e()Ly2/e;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    monitor-exit v2

    sget-object v0, LD/v0;->v:LB2/G;

    iget-object v0, p0, LD/s0;->k:LD/v0;

    iget-object v0, v0, LD/v0;->u:LD/U;

    invoke-static {v0}, LD/U;->b(LD/U;)V

    throw p1

    :goto_8
    monitor-exit v2

    throw p1

    :catchall_5
    move-exception p1

    monitor-exit v4

    throw p1

    :catchall_6
    move-exception p1

    goto :goto_9

    :cond_b
    :try_start_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Recomposer already running"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Recomposer shut down"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    throw v5
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    :goto_9
    monitor-exit v4

    throw p1

    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Current context doesn\'t contain Job in it: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
