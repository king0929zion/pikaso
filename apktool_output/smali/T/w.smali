.class public final Lt/w;
.super LP/k;
.source "SourceFile"

# interfaces
.implements Ln0/s;


# instance fields
.field public q:F

.field public r:F


# virtual methods
.method public final R(Ln0/L;Ll0/j;J)LM1/j;
    .locals 5

    iget v0, p0, Lt/w;->q:F

    const/high16 v1, 0x7fc00000    # Float.NaN

    invoke-static {v0, v1}, LG0/e;->a(FF)Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    invoke-static {p3, p4}, LG0/a;->j(J)I

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lt/w;->q:F

    invoke-interface {p1, v0}, LG0/b;->b(F)I

    move-result v0

    invoke-static {p3, p4}, LG0/a;->h(J)I

    move-result v3

    if-le v0, v3, :cond_0

    move v0, v3

    :cond_0
    if-gez v0, :cond_2

    move v0, v2

    goto :goto_0

    :cond_1
    invoke-static {p3, p4}, LG0/a;->j(J)I

    move-result v0

    :cond_2
    :goto_0
    invoke-static {p3, p4}, LG0/a;->h(J)I

    move-result v3

    iget v4, p0, Lt/w;->r:F

    invoke-static {v4, v1}, LG0/e;->a(FF)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-static {p3, p4}, LG0/a;->i(J)I

    move-result v1

    if-nez v1, :cond_5

    iget v1, p0, Lt/w;->r:F

    invoke-interface {p1, v1}, LG0/b;->b(F)I

    move-result v1

    invoke-static {p3, p4}, LG0/a;->g(J)I

    move-result v4

    if-le v1, v4, :cond_3

    move v1, v4

    :cond_3
    if-gez v1, :cond_4

    goto :goto_1

    :cond_4
    move v2, v1

    goto :goto_1

    :cond_5
    invoke-static {p3, p4}, LG0/a;->i(J)I

    move-result v2

    :goto_1
    invoke-static {p3, p4}, LG0/a;->g(J)I

    move-result p3

    invoke-static {v0, v3, v2, p3}, La/a;->a(IIII)J

    move-result-wide p3

    invoke-interface {p2, p3, p4}, Ll0/j;->a(J)Ll0/o;

    move-result-object p2

    iget p3, p2, Ll0/o;->d:I

    iget p4, p2, Ll0/o;->e:I

    new-instance v0, LT/b;

    const/4 v1, 0x4

    invoke-direct {v0, p2, v1}, LT/b;-><init>(Ll0/o;I)V

    sget-object p2, Ld2/t;->d:Ld2/t;

    invoke-virtual {p1, p3, p4, p2, v0}, Ln0/L;->b0(IILjava/util/Map;Lo2/c;)LM1/j;

    move-result-object p1

    return-object p1
.end method
