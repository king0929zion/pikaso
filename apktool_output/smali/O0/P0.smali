.class public final Lo0/P0;
.super Li2/j;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# instance fields
.field public h:I

.field public final synthetic i:LD/v0;

.field public final synthetic j:Landroid/view/View;


# direct methods
.method public constructor <init>(LD/v0;Landroid/view/View;Lg2/d;)V
    .locals 0

    iput-object p1, p0, Lo0/P0;->i:LD/v0;

    iput-object p2, p0, Lo0/P0;->j:Landroid/view/View;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Li2/j;-><init>(ILg2/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lg2/d;Ljava/lang/Object;)Lg2/d;
    .locals 2

    new-instance p2, Lo0/P0;

    iget-object v0, p0, Lo0/P0;->i:LD/v0;

    iget-object v1, p0, Lo0/P0;->j:Landroid/view/View;

    invoke-direct {p2, v0, v1, p1}, Lo0/P0;-><init>(LD/v0;Landroid/view/View;Lg2/d;)V

    return-object p2
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly2/u;

    check-cast p2, Lg2/d;

    invoke-virtual {p0, p2, p1}, Lo0/P0;->f(Lg2/d;Ljava/lang/Object;)Lg2/d;

    move-result-object p1

    check-cast p1, Lo0/P0;

    sget-object p2, Lc2/m;->a:Lc2/m;

    invoke-virtual {p1, p2}, Lo0/P0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lh2/a;->d:Lh2/a;

    iget v1, p0, Lo0/P0;->h:I

    sget-object v2, Lc2/m;->a:Lc2/m;

    iget-object v3, p0, Lo0/P0;->i:LD/v0;

    iget-object v4, p0, Lo0/P0;->j:Landroid/view/View;

    const v5, 0x7f080048

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v7, :cond_0

    :try_start_0
    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    :try_start_1
    iput v7, p0, Lo0/P0;->h:I

    iget-object p1, v3, LD/v0;->r:LB2/G;

    new-instance v1, LD/p0;

    const/4 v7, 0x2

    invoke-direct {v1, v7, v6}, Li2/j;-><init>(ILg2/d;)V

    invoke-static {p1, v1, p0}, LB2/w;->d(LB2/e;Lo2/e;Li2/c;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_2
    move-object p1, v2

    :goto_0
    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    invoke-static {v4}, Lo0/X0;->b(Landroid/view/View;)LD/q;

    move-result-object p1

    if-ne p1, v3, :cond_4

    invoke-virtual {v4, v5, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_4
    return-object v2

    :goto_2
    invoke-static {v4}, Lo0/X0;->b(Landroid/view/View;)LD/q;

    move-result-object v0

    if-ne v0, v3, :cond_5

    invoke-virtual {v4, v5, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_5
    throw p1
.end method
