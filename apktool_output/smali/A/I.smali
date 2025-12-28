.class public final LA/I;
.super Li2/j;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# virtual methods
.method public final f(Lg2/d;Ljava/lang/Object;)Lg2/d;
    .locals 1

    new-instance p2, LA/I;

    const/4 v0, 0x2

    invoke-direct {p2, v0, p1}, Li2/j;-><init>(ILg2/d;)V

    return-object p2
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh0/r;

    check-cast p2, Lg2/d;

    invoke-virtual {p0, p2, p1}, LA/I;->f(Lg2/d;Ljava/lang/Object;)Lg2/d;

    move-result-object p1

    check-cast p1, LA/I;

    sget-object p2, Lc2/m;->a:Lc2/m;

    invoke-virtual {p1, p2}, LA/I;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1
.end method
