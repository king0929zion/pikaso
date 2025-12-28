.class public final Lr/g;
.super Li2/j;
.source "SourceFile"

# interfaces
.implements Lo2/f;


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr/e;

    check-cast p2, LV/c;

    iget-wide p1, p2, LV/c;->a:J

    check-cast p3, Lg2/d;

    new-instance p1, Lr/g;

    const/4 p2, 0x3

    invoke-direct {p1, p2, p3}, Li2/j;-><init>(ILg2/d;)V

    sget-object p2, Lc2/m;->a:Lc2/m;

    invoke-virtual {p1, p2}, Lr/g;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    sget-object p1, Lc2/m;->a:Lc2/m;

    return-object p1
.end method
