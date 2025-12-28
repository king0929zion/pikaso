.class public final LC2/m;
.super Li2/j;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# instance fields
.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:LC2/n;

.field public final synthetic k:LB2/f;


# direct methods
.method public constructor <init>(LC2/n;LB2/f;Lg2/d;)V
    .locals 0

    iput-object p1, p0, LC2/m;->j:LC2/n;

    iput-object p2, p0, LC2/m;->k:LB2/f;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Li2/j;-><init>(ILg2/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lg2/d;Ljava/lang/Object;)Lg2/d;
    .locals 3

    new-instance v0, LC2/m;

    iget-object v1, p0, LC2/m;->j:LC2/n;

    iget-object v2, p0, LC2/m;->k:LB2/f;

    invoke-direct {v0, v1, v2, p1}, LC2/m;-><init>(LC2/n;LB2/f;Lg2/d;)V

    iput-object p2, v0, LC2/m;->i:Ljava/lang/Object;

    return-object v0
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly2/u;

    check-cast p2, Lg2/d;

    invoke-virtual {p0, p2, p1}, LC2/m;->f(Lg2/d;Ljava/lang/Object;)Lg2/d;

    move-result-object p1

    check-cast p1, LC2/m;

    sget-object p2, Lc2/m;->a:Lc2/m;

    invoke-virtual {p1, p2}, LC2/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lh2/a;->d:Lh2/a;

    iget v1, p0, LC2/m;->h:I

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

    iget-object p1, p0, LC2/m;->i:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Ly2/u;

    new-instance v4, Lp2/o;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iget-object v6, p0, LC2/m;->j:LC2/n;

    iget-object p1, v6, LC2/h;->g:LB2/e;

    new-instance v1, LC2/l;

    iget-object v7, p0, LC2/m;->k:LB2/f;

    const/4 v8, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v8}, LC2/l;-><init>(Ljava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput v2, p0, LC2/m;->h:I

    invoke-interface {p1, v1, p0}, LB2/e;->o(LB2/f;Lg2/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1
.end method
