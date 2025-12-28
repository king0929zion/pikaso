.class public final LC2/j;
.super Li2/j;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# instance fields
.field public h:I

.field public final synthetic i:LC2/n;

.field public final synthetic j:LB2/f;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LC2/n;LB2/f;Ljava/lang/Object;Lg2/d;)V
    .locals 0

    iput-object p1, p0, LC2/j;->i:LC2/n;

    iput-object p2, p0, LC2/j;->j:LB2/f;

    iput-object p3, p0, LC2/j;->k:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Li2/j;-><init>(ILg2/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lg2/d;Ljava/lang/Object;)Lg2/d;
    .locals 3

    new-instance p2, LC2/j;

    iget-object v0, p0, LC2/j;->j:LB2/f;

    iget-object v1, p0, LC2/j;->k:Ljava/lang/Object;

    iget-object v2, p0, LC2/j;->i:LC2/n;

    invoke-direct {p2, v2, v0, v1, p1}, LC2/j;-><init>(LC2/n;LB2/f;Ljava/lang/Object;Lg2/d;)V

    return-object p2
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly2/u;

    check-cast p2, Lg2/d;

    invoke-virtual {p0, p2, p1}, LC2/j;->f(Lg2/d;Ljava/lang/Object;)Lg2/d;

    move-result-object p1

    check-cast p1, LC2/j;

    sget-object p2, Lc2/m;->a:Lc2/m;

    invoke-virtual {p1, p2}, LC2/j;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lh2/a;->d:Lh2/a;

    iget v1, p0, LC2/j;->h:I

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

    iget-object p1, p0, LC2/j;->i:LC2/n;

    iget-object p1, p1, LC2/n;->h:Li2/j;

    iput v2, p0, LC2/j;->h:I

    iget-object v1, p0, LC2/j;->j:LB2/f;

    iget-object v2, p0, LC2/j;->k:Ljava/lang/Object;

    invoke-interface {p1, v1, v2, p0}, Lo2/f;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1
.end method
