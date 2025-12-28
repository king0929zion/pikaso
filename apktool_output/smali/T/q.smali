.class public final Lt/q;
.super LP/k;
.source "SourceFile"

# interfaces
.implements Ln0/s;


# instance fields
.field public q:Lt/p;


# virtual methods
.method public final R(Ln0/L;Ll0/j;J)LM1/j;
    .locals 5

    iget-object v0, p0, Lt/q;->q:Lt/p;

    invoke-virtual {p1}, Ln0/L;->getLayoutDirection()LG0/f;

    move-result-object v1

    sget-object v2, LG0/f;->d:LG0/f;

    if-ne v1, v2, :cond_0

    iget v0, v0, Lt/p;->a:F

    goto :goto_0

    :cond_0
    iget v0, v0, Lt/p;->c:F

    :goto_0
    const/4 v1, 0x0

    int-to-float v1, v1

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-ltz v0, :cond_4

    iget-object v0, p0, Lt/q;->q:Lt/p;

    iget v0, v0, Lt/p;->b:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-ltz v0, :cond_4

    iget-object v0, p0, Lt/q;->q:Lt/p;

    invoke-virtual {p1}, Ln0/L;->getLayoutDirection()LG0/f;

    move-result-object v3

    if-ne v3, v2, :cond_1

    iget v0, v0, Lt/p;->c:F

    goto :goto_1

    :cond_1
    iget v0, v0, Lt/p;->a:F

    :goto_1
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-ltz v0, :cond_4

    iget-object v0, p0, Lt/q;->q:Lt/p;

    iget v0, v0, Lt/p;->d:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-ltz v0, :cond_4

    iget-object v0, p0, Lt/q;->q:Lt/p;

    invoke-virtual {p1}, Ln0/L;->getLayoutDirection()LG0/f;

    move-result-object v1

    if-ne v1, v2, :cond_2

    iget v0, v0, Lt/p;->a:F

    goto :goto_2

    :cond_2
    iget v0, v0, Lt/p;->c:F

    :goto_2
    invoke-interface {p1, v0}, LG0/b;->b(F)I

    move-result v0

    iget-object v1, p0, Lt/q;->q:Lt/p;

    invoke-virtual {p1}, Ln0/L;->getLayoutDirection()LG0/f;

    move-result-object v3

    if-ne v3, v2, :cond_3

    iget v1, v1, Lt/p;->c:F

    goto :goto_3

    :cond_3
    iget v1, v1, Lt/p;->a:F

    :goto_3
    invoke-interface {p1, v1}, LG0/b;->b(F)I

    move-result v1

    add-int/2addr v1, v0

    iget-object v0, p0, Lt/q;->q:Lt/p;

    iget v0, v0, Lt/p;->b:F

    invoke-interface {p1, v0}, LG0/b;->b(F)I

    move-result v0

    iget-object v2, p0, Lt/q;->q:Lt/p;

    iget v2, v2, Lt/p;->d:F

    invoke-interface {p1, v2}, LG0/b;->b(F)I

    move-result v2

    add-int/2addr v2, v0

    neg-int v0, v1

    neg-int v3, v2

    invoke-static {v0, v3, p3, p4}, La/a;->V(IIJ)J

    move-result-wide v3

    invoke-interface {p2, v3, v4}, Ll0/j;->a(J)Ll0/o;

    move-result-object p2

    iget v0, p2, Ll0/o;->d:I

    add-int/2addr v0, v1

    invoke-static {p3, p4, v0}, La/a;->p(JI)I

    move-result v0

    iget v1, p2, Ll0/o;->e:I

    add-int/2addr v1, v2

    invoke-static {p3, p4, v1}, La/a;->o(JI)I

    move-result p3

    new-instance p4, LD2/p;

    const/4 v1, 0x4

    invoke-direct {p4, p2, p1, p0, v1}, LD2/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    sget-object p2, Ld2/t;->d:Ld2/t;

    invoke-virtual {p1, v0, p3, p2, p4}, Ln0/L;->b0(IILjava/util/Map;Lo2/c;)LM1/j;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Padding must be non-negative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
