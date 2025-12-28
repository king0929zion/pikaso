.class public final Lt/o;
.super LP/k;
.source "SourceFile"

# interfaces
.implements Ln0/s;


# instance fields
.field public q:F

.field public r:F

.field public s:F

.field public t:F

.field public u:Z


# virtual methods
.method public final R(Ln0/L;Ll0/j;J)LM1/j;
    .locals 5

    iget v0, p0, Lt/o;->q:F

    invoke-interface {p1, v0}, LG0/b;->b(F)I

    move-result v0

    iget v1, p0, Lt/o;->s:F

    invoke-interface {p1, v1}, LG0/b;->b(F)I

    move-result v1

    add-int/2addr v1, v0

    iget v0, p0, Lt/o;->r:F

    invoke-interface {p1, v0}, LG0/b;->b(F)I

    move-result v0

    iget v2, p0, Lt/o;->t:F

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

    const/4 v1, 0x3

    invoke-direct {p4, p0, p2, p1, v1}, LD2/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    sget-object p2, Ld2/t;->d:Ld2/t;

    invoke-virtual {p1, v0, p3, p2, p4}, Ln0/L;->b0(IILjava/util/Map;Lo2/c;)LM1/j;

    move-result-object p1

    return-object p1
.end method
