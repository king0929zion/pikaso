.class public final Lo0/U0;
.super Li2/j;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# instance fields
.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Lp2/o;

.field public final synthetic k:LD/v0;

.field public final synthetic l:Landroidx/lifecycle/r;

.field public final synthetic m:Lo0/V0;

.field public final synthetic n:Landroid/view/View;


# direct methods
.method public constructor <init>(Lp2/o;LD/v0;Landroidx/lifecycle/r;Lo0/V0;Landroid/view/View;Lg2/d;)V
    .locals 0

    iput-object p1, p0, Lo0/U0;->j:Lp2/o;

    iput-object p2, p0, Lo0/U0;->k:LD/v0;

    iput-object p3, p0, Lo0/U0;->l:Landroidx/lifecycle/r;

    iput-object p4, p0, Lo0/U0;->m:Lo0/V0;

    iput-object p5, p0, Lo0/U0;->n:Landroid/view/View;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Li2/j;-><init>(ILg2/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lg2/d;Ljava/lang/Object;)Lg2/d;
    .locals 8

    new-instance v7, Lo0/U0;

    iget-object v4, p0, Lo0/U0;->m:Lo0/V0;

    iget-object v5, p0, Lo0/U0;->n:Landroid/view/View;

    iget-object v1, p0, Lo0/U0;->j:Lp2/o;

    iget-object v2, p0, Lo0/U0;->k:LD/v0;

    iget-object v3, p0, Lo0/U0;->l:Landroidx/lifecycle/r;

    move-object v0, v7

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lo0/U0;-><init>(Lp2/o;LD/v0;Landroidx/lifecycle/r;Lo0/V0;Landroid/view/View;Lg2/d;)V

    iput-object p2, v7, Lo0/U0;->i:Ljava/lang/Object;

    return-object v7
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly2/u;

    check-cast p2, Lg2/d;

    invoke-virtual {p0, p2, p1}, Lo0/U0;->f(Lg2/d;Ljava/lang/Object;)Lg2/d;

    move-result-object p1

    check-cast p1, Lo0/U0;

    sget-object p2, Lc2/m;->a:Lc2/m;

    invoke-virtual {p1, p2}, Lo0/U0;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lh2/a;->d:Lh2/a;

    iget v1, p0, Lo0/U0;->h:I

    iget-object v2, p0, Lo0/U0;->l:Landroidx/lifecycle/r;

    sget-object v3, Lc2/m;->a:Lc2/m;

    const/4 v4, 0x0

    iget-object v5, p0, Lo0/U0;->m:Lo0/V0;

    const/4 v6, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v6, :cond_0

    iget-object v0, p0, Lo0/U0;->i:Ljava/lang/Object;

    check-cast v0, Ly2/S;

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
    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    iget-object p1, p0, Lo0/U0;->i:Ljava/lang/Object;

    check-cast p1, Ly2/u;

    :try_start_1
    iget-object v1, p0, Lo0/U0;->j:Lp2/o;

    iget-object v1, v1, Lp2/o;->d:Ljava/lang/Object;

    check-cast v1, Lo0/p0;

    if-eqz v1, :cond_2

    iget-object v7, p0, Lo0/U0;->n:Landroid/view/View;

    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v7

    invoke-static {v7}, Lo0/X0;->a(Landroid/content/Context;)LB2/E;

    move-result-object v7

    invoke-interface {v7}, LB2/E;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    move-result v8

    iget-object v9, v1, Lo0/p0;->d:LD/c0;

    invoke-virtual {v9, v8}, LD/c0;->g(F)V

    new-instance v8, Lo0/T0;

    invoke-direct {v8, v7, v1, v4}, Lo0/T0;-><init>(LB2/E;Lo0/p0;Lg2/d;)V

    const/4 v1, 0x0

    const/4 v7, 0x3

    invoke-static {p1, v4, v1, v8, v7}, Ly2/v;->l(Ly2/u;Lg2/a;ILo2/e;I)Ly2/h0;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :goto_0
    move-object v0, v4

    goto :goto_6

    :catchall_1
    move-exception p1

    goto :goto_0

    :cond_2
    move-object p1, v4

    :goto_1
    :try_start_2
    iget-object v1, p0, Lo0/U0;->k:LD/v0;

    iput-object p1, p0, Lo0/U0;->i:Ljava/lang/Object;

    iput v6, p0, Lo0/U0;->h:I

    new-instance v6, LD/u0;

    invoke-direct {v6, v1, v4}, LD/u0;-><init>(LD/v0;Lg2/d;)V

    iget-object v7, p0, Li2/c;->e:Lg2/i;

    invoke-static {v7}, Lp2/g;->b(Ljava/lang/Object;)V

    invoke-static {v7}, LD/d;->x(Lg2/i;)LD/V;

    move-result-object v7

    new-instance v8, LD/s0;

    invoke-direct {v8, v1, v6, v7, v4}, LD/s0;-><init>(LD/v0;LD/u0;LD/V;Lg2/d;)V

    iget-object v1, v1, LD/v0;->a:LD/h;

    invoke-static {v1, v8, p0}, Ly2/v;->s(Lg2/g;Lo2/e;Li2/c;)Ljava/lang/Object;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne v1, v0, :cond_3

    goto :goto_2

    :cond_3
    move-object v1, v3

    :goto_2
    if-ne v1, v0, :cond_4

    goto :goto_3

    :cond_4
    move-object v1, v3

    :goto_3
    if-ne v1, v0, :cond_5

    return-object v0

    :cond_5
    move-object v0, p1

    :goto_4
    if-eqz v0, :cond_6

    invoke-interface {v0, v4}, Ly2/S;->a(Ljava/util/concurrent/CancellationException;)V

    :cond_6
    invoke-interface {v2}, Landroidx/lifecycle/r;->c()Landroidx/lifecycle/t;

    move-result-object p1

    invoke-virtual {p1, v5}, Landroidx/lifecycle/t;->f(Landroidx/lifecycle/q;)V

    return-object v3

    :goto_5
    move-object v10, v0

    move-object v0, p1

    move-object p1, v10

    goto :goto_6

    :catchall_2
    move-exception v0

    goto :goto_5

    :goto_6
    if-eqz v0, :cond_7

    invoke-interface {v0, v4}, Ly2/S;->a(Ljava/util/concurrent/CancellationException;)V

    :cond_7
    invoke-interface {v2}, Landroidx/lifecycle/r;->c()Landroidx/lifecycle/t;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroidx/lifecycle/t;->f(Landroidx/lifecycle/q;)V

    throw p1
.end method
