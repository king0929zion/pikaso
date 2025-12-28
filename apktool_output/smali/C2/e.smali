.class public final LC2/e;
.super Li2/j;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# instance fields
.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:LB2/f;

.field public final synthetic k:LC2/h;


# direct methods
.method public constructor <init>(LB2/f;LC2/h;Lg2/d;)V
    .locals 0

    iput-object p1, p0, LC2/e;->j:LB2/f;

    iput-object p2, p0, LC2/e;->k:LC2/h;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Li2/j;-><init>(ILg2/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lg2/d;Ljava/lang/Object;)Lg2/d;
    .locals 3

    new-instance v0, LC2/e;

    iget-object v1, p0, LC2/e;->j:LB2/f;

    iget-object v2, p0, LC2/e;->k:LC2/h;

    invoke-direct {v0, v1, v2, p1}, LC2/e;-><init>(LB2/f;LC2/h;Lg2/d;)V

    iput-object p2, v0, LC2/e;->i:Ljava/lang/Object;

    return-object v0
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly2/u;

    check-cast p2, Lg2/d;

    invoke-virtual {p0, p2, p1}, LC2/e;->f(Lg2/d;Ljava/lang/Object;)Lg2/d;

    move-result-object p1

    check-cast p1, LC2/e;

    sget-object p2, Lc2/m;->a:Lc2/m;

    invoke-virtual {p1, p2}, LC2/e;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lh2/a;->d:Lh2/a;

    iget v1, p0, LC2/e;->h:I

    sget-object v2, Lc2/m;->a:Lc2/m;

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    iget-object p1, p0, LC2/e;->i:Ljava/lang/Object;

    check-cast p1, Ly2/u;

    iget-object v1, p0, LC2/e;->k:LC2/h;

    iget v4, v1, LC2/h;->e:I

    const/4 v5, -0x3

    if-ne v4, v5, :cond_2

    const/4 v4, -0x2

    :cond_2
    new-instance v5, LC2/f;

    const/4 v6, 0x0

    invoke-direct {v5, v1, v6}, LC2/f;-><init>(LC2/h;Lg2/d;)V

    const/4 v6, 0x4

    iget v7, v1, LC2/h;->f:I

    invoke-static {v4, v7, v6}, LA2/i;->a(III)LA2/b;

    move-result-object v4

    invoke-interface {p1}, Ly2/u;->m()Lg2/i;

    move-result-object p1

    iget-object v1, v1, LC2/h;->d:Lg2/i;

    invoke-static {p1, v1, v3}, Ly2/v;->e(Lg2/i;Lg2/i;Z)Lg2/i;

    move-result-object p1

    sget-object v1, Ly2/B;->a:LF2/d;

    if-eq p1, v1, :cond_3

    sget-object v6, Lg2/e;->d:Lg2/e;

    invoke-interface {p1, v6}, Lg2/i;->n(Lg2/h;)Lg2/g;

    move-result-object v6

    if-nez v6, :cond_3

    invoke-interface {p1, v1}, Lg2/i;->i(Lg2/i;)Lg2/i;

    move-result-object p1

    :cond_3
    new-instance v1, LA2/n;

    invoke-direct {v1, p1, v4}, LA2/n;-><init>(Lg2/i;LA2/b;)V

    const/4 p1, 0x3

    invoke-virtual {v1, p1, v1, v5}, Ly2/a;->c0(ILy2/a;Lo2/e;)V

    iput v3, p0, LC2/e;->h:I

    iget-object p1, p0, LC2/e;->j:LB2/f;

    invoke-static {p1, v1, v3, p0}, LB2/w;->c(LB2/f;LA2/n;ZLi2/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_0

    :cond_4
    move-object p1, v2

    :goto_0
    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_1
    return-object v2
.end method
