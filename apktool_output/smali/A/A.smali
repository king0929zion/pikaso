.class public final LA/A;
.super LP/k;
.source "SourceFile"

# interfaces
.implements Ln0/g;
.implements Ln0/s;


# virtual methods
.method public final R(Ln0/L;Ll0/j;J)LM1/j;
    .locals 4

    sget-object v0, LA/w;->a:LD/M0;

    invoke-static {p0, v0}, Ln0/C;->h(Ln0/g;LD/k0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LG0/e;

    iget v0, v0, LG0/e;->d:F

    const/4 v1, 0x0

    int-to-float v2, v1

    cmpg-float v3, v0, v2

    if-gez v3, :cond_0

    move v0, v2

    :cond_0
    invoke-interface {p2, p3, p4}, Ll0/j;->a(J)Ll0/o;

    move-result-object p2

    iget-boolean p3, p0, LP/k;->p:Z

    if-eqz p3, :cond_1

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result p3

    if-nez p3, :cond_1

    invoke-static {v0, v2}, Ljava/lang/Float;->compare(FF)I

    move-result p3

    if-lez p3, :cond_1

    const/4 p3, 0x1

    goto :goto_0

    :cond_1
    move p3, v1

    :goto_0
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result p4

    if-nez p4, :cond_2

    invoke-interface {p1, v0}, LG0/b;->b(F)I

    move-result v1

    :cond_2
    if-eqz p3, :cond_3

    iget p4, p2, Ll0/o;->d:I

    invoke-static {p4, v1}, Ljava/lang/Math;->max(II)I

    move-result p4

    goto :goto_1

    :cond_3
    iget p4, p2, Ll0/o;->d:I

    :goto_1
    if-eqz p3, :cond_4

    iget p3, p2, Ll0/o;->e:I

    invoke-static {p3, v1}, Ljava/lang/Math;->max(II)I

    move-result p3

    goto :goto_2

    :cond_4
    iget p3, p2, Ll0/o;->e:I

    :goto_2
    new-instance v0, LA/z;

    invoke-direct {v0, p4, p2, p3}, LA/z;-><init>(ILl0/o;I)V

    sget-object p2, Ld2/t;->d:Ld2/t;

    invoke-virtual {p1, p4, p3, p2, v0}, Ln0/L;->b0(IILjava/util/Map;Lo2/c;)LM1/j;

    move-result-object p1

    return-object p1
.end method
