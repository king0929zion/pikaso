.class public final Lh0/q;
.super Li2/j;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# instance fields
.field public h:I

.field public final synthetic i:Lh0/r;


# direct methods
.method public constructor <init>(Lh0/r;Lg2/d;)V
    .locals 0

    iput-object p1, p0, Lh0/q;->i:Lh0/r;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Li2/j;-><init>(ILg2/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lg2/d;Ljava/lang/Object;)Lg2/d;
    .locals 1

    new-instance p2, Lh0/q;

    iget-object v0, p0, Lh0/q;->i:Lh0/r;

    invoke-direct {p2, v0, p1}, Lh0/q;-><init>(Lh0/r;Lg2/d;)V

    return-object p2
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly2/u;

    check-cast p2, Lg2/d;

    invoke-virtual {p0, p2, p1}, Lh0/q;->f(Lg2/d;Ljava/lang/Object;)Lg2/d;

    move-result-object p1

    check-cast p1, Lh0/q;

    sget-object p2, Lc2/m;->a:Lc2/m;

    invoke-virtual {p1, p2}, Lh0/q;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lh2/a;->d:Lh2/a;

    iget v1, p0, Lh0/q;->h:I

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

    iget-object p1, p0, Lh0/q;->i:Lh0/r;

    iget-object v1, p1, Lh0/r;->t:Li2/j;

    iput v2, p0, Lh0/q;->h:I

    invoke-interface {v1, p1, p0}, Lo2/e;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1
.end method
