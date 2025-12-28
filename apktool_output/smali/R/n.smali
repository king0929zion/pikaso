.class public final Lr/n;
.super Li2/j;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# instance fields
.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Lh0/r;

.field public final synthetic k:Lq/k;

.field public final synthetic l:LD/y;

.field public final synthetic m:Lr/e;


# direct methods
.method public constructor <init>(Lh0/r;Lq/k;LD/y;Lr/e;Lg2/d;)V
    .locals 0

    iput-object p1, p0, Lr/n;->j:Lh0/r;

    iput-object p2, p0, Lr/n;->k:Lq/k;

    iput-object p3, p0, Lr/n;->l:LD/y;

    iput-object p4, p0, Lr/n;->m:Lr/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Li2/j;-><init>(ILg2/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lg2/d;Ljava/lang/Object;)Lg2/d;
    .locals 7

    new-instance v6, Lr/n;

    iget-object v3, p0, Lr/n;->l:LD/y;

    iget-object v4, p0, Lr/n;->m:Lr/e;

    iget-object v2, p0, Lr/n;->k:Lq/k;

    iget-object v1, p0, Lr/n;->j:Lh0/r;

    move-object v0, v6

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lr/n;-><init>(Lh0/r;Lq/k;LD/y;Lr/e;Lg2/d;)V

    iput-object p2, v6, Lr/n;->i:Ljava/lang/Object;

    return-object v6
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly2/u;

    check-cast p2, Lg2/d;

    invoke-virtual {p0, p2, p1}, Lr/n;->f(Lg2/d;Ljava/lang/Object;)Lg2/d;

    move-result-object p1

    check-cast p1, Lr/n;

    sget-object p2, Lc2/m;->a:Lc2/m;

    invoke-virtual {p1, p2}, Lr/n;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lh2/a;->d:Lh2/a;

    iget v1, p0, Lr/n;->h:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    iget-object p1, p0, Lr/n;->i:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Ly2/u;

    new-instance p1, Lr/m;

    iget-object v7, p0, Lr/n;->m:Lr/e;

    iget-object v5, p0, Lr/n;->k:Lq/k;

    iget-object v6, p0, Lr/n;->l:LD/y;

    const/4 v8, 0x0

    move-object v3, p1

    invoke-direct/range {v3 .. v8}, Lr/m;-><init>(Ly2/u;Lq/k;LD/y;Lr/e;Lg2/d;)V

    iput v2, p0, Lr/n;->h:I

    iget-object v1, p0, Lr/n;->j:Lh0/r;

    iget-object v2, p0, Li2/c;->e:Lg2/i;

    invoke-static {v2}, Lp2/g;->b(Ljava/lang/Object;)V

    new-instance v3, Lr/b;

    const/4 v4, 0x0

    invoke-direct {v3, v2, p1, v4}, Lr/b;-><init>(Lg2/i;Lo2/e;Lg2/d;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ly2/f;

    invoke-static {p0}, LZ/b;->z(Lg2/d;)Lg2/d;

    move-result-object v2

    const/4 v4, 0x1

    invoke-direct {p1, v4, v2}, Ly2/f;-><init>(ILg2/d;)V

    invoke-virtual {p1}, Ly2/f;->u()V

    new-instance v2, Lh0/p;

    invoke-direct {v2, v1, p1}, Lh0/p;-><init>(Lh0/r;Ly2/f;)V

    iget-object v4, v1, Lh0/r;->w:LF/d;

    monitor-enter v4

    :try_start_0
    iget-object v1, v1, Lh0/r;->w:LF/d;

    invoke-virtual {v1, v2}, LF/d;->b(Ljava/lang/Object;)V

    new-instance v1, Lg2/k;

    invoke-static {v2, v2, v3}, LZ/b;->n(Lg2/d;Lg2/d;Lo2/e;)Lg2/d;

    move-result-object v3

    invoke-static {v3}, LZ/b;->z(Lg2/d;)Lg2/d;

    move-result-object v3

    sget-object v5, Lh2/a;->d:Lh2/a;

    invoke-direct {v1, v3}, Lg2/k;-><init>(Lg2/d;)V

    sget-object v3, Lc2/m;->a:Lc2/m;

    invoke-virtual {v1, v3}, Lg2/k;->t(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v4

    new-instance v1, LD/y;

    const/16 v4, 0xc

    invoke-direct {v1, v4, v2}, LD/y;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v1}, Ly2/f;->x(Lo2/c;)V

    invoke-virtual {p1}, Ly2/f;->s()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v5, :cond_2

    move-object v3, p1

    :cond_2
    if-ne v3, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v4

    throw p1
.end method
