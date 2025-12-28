.class public final Lv0/y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lv0/x;

.field public final b:Lv0/i;

.field public final c:J

.field public final d:F

.field public final e:F

.field public final f:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lv0/x;Lv0/i;J)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv0/y;->a:Lv0/x;

    iput-object p2, p0, Lv0/y;->b:Lv0/i;

    iput-wide p3, p0, Lv0/y;->c:J

    iget-object p1, p2, Lv0/i;->h:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p3

    const/4 p4, 0x0

    if-eqz p3, :cond_0

    move p3, p4

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv0/k;

    iget-object v0, v0, Lv0/k;->a:Lv0/a;

    iget-object v0, v0, Lv0/a;->d:Lw0/w;

    invoke-virtual {v0, p3}, Lw0/w;->c(I)F

    move-result p3

    :goto_0
    iput p3, p0, Lv0/y;->d:F

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p1}, Ld2/k;->e0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv0/k;

    iget-object p3, p1, Lv0/k;->a:Lv0/a;

    iget-object p3, p3, Lv0/a;->d:Lw0/w;

    iget p4, p3, Lw0/w;->f:I

    add-int/lit8 p4, p4, -0x1

    invoke-virtual {p3, p4}, Lw0/w;->c(I)F

    move-result p3

    iget p1, p1, Lv0/k;->f:F

    add-float p4, p3, p1

    :goto_1
    iput p4, p0, Lv0/y;->e:F

    iget-object p1, p2, Lv0/i;->g:Ljava/util/ArrayList;

    iput-object p1, p0, Lv0/y;->f:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 2

    iget-object v0, p0, Lv0/y;->b:Lv0/i;

    iget-object v1, v0, Lv0/i;->a:La1/c;

    iget-object v1, v1, La1/c;->c:Ljava/lang/Object;

    check-cast v1, Lv0/c;

    iget-object v1, v1, Lv0/c;->d:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    iget-object v0, v0, Lv0/i;->h:Ljava/util/ArrayList;

    if-lt p1, v1, :cond_0

    invoke-static {v0}, Ld2/l;->T(Ljava/util/List;)I

    move-result v1

    goto :goto_0

    :cond_0
    if-gez p1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    invoke-static {p1, v0}, LZ0/d;->t(ILjava/util/ArrayList;)I

    move-result v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv0/k;

    iget-object v1, v0, Lv0/k;->a:Lv0/a;

    invoke-virtual {v0, p1}, Lv0/k;->a(I)I

    move-result p1

    iget-object v1, v1, Lv0/a;->d:Lw0/w;

    iget-object v1, v1, Lw0/w;->e:Landroid/text/Layout;

    invoke-virtual {v1, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result p1

    iget v0, v0, Lv0/k;->d:I

    add-int/2addr p1, v0

    return p1
.end method

.method public final b(F)I
    .locals 8

    iget-object v0, p0, Lv0/y;->b:Lv0/i;

    iget-object v0, v0, Lv0/i;->h:Ljava/util/ArrayList;

    const/4 v1, 0x0

    cmpg-float v1, p1, v1

    const/4 v2, 0x0

    if-gtz v1, :cond_0

    goto :goto_2

    :cond_0
    invoke-static {v0}, Ld2/k;->e0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv0/k;

    iget v1, v1, Lv0/k;->g:F

    cmpl-float v1, p1, v1

    if-ltz v1, :cond_1

    invoke-static {v0}, Ld2/l;->T(Ljava/util/List;)I

    move-result v2

    goto :goto_2

    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v3, 0x1

    sub-int/2addr v1, v3

    move v4, v2

    :goto_0
    if-gt v4, v1, :cond_6

    add-int v5, v4, v1

    ushr-int/2addr v5, v3

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lv0/k;

    iget v7, v6, Lv0/k;->f:F

    cmpl-float v7, v7, p1

    if-lez v7, :cond_2

    move v6, v3

    goto :goto_1

    :cond_2
    iget v6, v6, Lv0/k;->g:F

    cmpg-float v6, v6, p1

    if-gtz v6, :cond_3

    const/4 v6, -0x1

    goto :goto_1

    :cond_3
    move v6, v2

    :goto_1
    if-gez v6, :cond_4

    add-int/lit8 v4, v5, 0x1

    goto :goto_0

    :cond_4
    if-lez v6, :cond_5

    add-int/lit8 v1, v5, -0x1

    goto :goto_0

    :cond_5
    move v2, v5

    goto :goto_2

    :cond_6
    add-int/2addr v4, v3

    neg-int v1, v4

    move v2, v1

    :goto_2
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv0/k;

    iget v1, v0, Lv0/k;->c:I

    iget v2, v0, Lv0/k;->b:I

    sub-int/2addr v1, v2

    iget v2, v0, Lv0/k;->d:I

    if-nez v1, :cond_7

    goto :goto_3

    :cond_7
    iget v1, v0, Lv0/k;->f:F

    sub-float/2addr p1, v1

    iget-object v0, v0, Lv0/k;->a:Lv0/a;

    float-to-int p1, p1

    iget-object v0, v0, Lv0/a;->d:Lw0/w;

    iget v1, v0, Lw0/w;->g:I

    sub-int/2addr p1, v1

    iget-object v0, v0, Lw0/w;->e:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineForVertical(I)I

    move-result p1

    add-int/2addr v2, p1

    :goto_3
    return v2
.end method

.method public final c(I)I
    .locals 3

    iget-object v0, p0, Lv0/y;->b:Lv0/i;

    invoke-virtual {v0, p1}, Lv0/i;->b(I)V

    iget-object v0, v0, Lv0/i;->h:Ljava/util/ArrayList;

    invoke-static {p1, v0}, LZ0/d;->u(ILjava/util/ArrayList;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv0/k;

    iget-object v1, v0, Lv0/k;->a:Lv0/a;

    iget v2, v0, Lv0/k;->d:I

    sub-int/2addr p1, v2

    iget-object v1, v1, Lv0/a;->d:Lw0/w;

    iget-object v1, v1, Lw0/w;->e:Landroid/text/Layout;

    invoke-virtual {v1, p1}, Landroid/text/Layout;->getLineStart(I)I

    move-result p1

    iget v0, v0, Lv0/k;->b:I

    add-int/2addr p1, v0

    return p1
.end method

.method public final d(I)F
    .locals 3

    iget-object v0, p0, Lv0/y;->b:Lv0/i;

    invoke-virtual {v0, p1}, Lv0/i;->b(I)V

    iget-object v0, v0, Lv0/i;->h:Ljava/util/ArrayList;

    invoke-static {p1, v0}, LZ0/d;->u(ILjava/util/ArrayList;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv0/k;

    iget-object v1, v0, Lv0/k;->a:Lv0/a;

    iget v2, v0, Lv0/k;->d:I

    sub-int/2addr p1, v2

    iget-object v1, v1, Lv0/a;->d:Lw0/w;

    invoke-virtual {v1, p1}, Lw0/w;->f(I)F

    move-result p1

    iget v0, v0, Lv0/k;->f:F

    add-float/2addr p1, v0

    return p1
.end method

.method public final e(I)I
    .locals 3

    iget-object v0, p0, Lv0/y;->b:Lv0/i;

    iget-object v1, v0, Lv0/i;->a:La1/c;

    if-ltz p1, :cond_2

    iget-object v2, v1, La1/c;->c:Ljava/lang/Object;

    check-cast v2, Lv0/c;

    iget-object v2, v2, Lv0/c;->d:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-gt p1, v2, :cond_2

    iget-object v1, v0, Lv0/i;->a:La1/c;

    iget-object v1, v1, La1/c;->c:Ljava/lang/Object;

    check-cast v1, Lv0/c;

    iget-object v1, v1, Lv0/c;->d:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    iget-object v0, v0, Lv0/i;->h:Ljava/util/ArrayList;

    if-ne p1, v1, :cond_0

    invoke-static {v0}, Ld2/l;->T(Ljava/util/List;)I

    move-result v1

    goto :goto_0

    :cond_0
    invoke-static {p1, v0}, LZ0/d;->t(ILjava/util/ArrayList;)I

    move-result v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv0/k;

    iget-object v1, v0, Lv0/k;->a:Lv0/a;

    invoke-virtual {v0, p1}, Lv0/k;->a(I)I

    move-result p1

    iget-object v0, v1, Lv0/a;->d:Lw0/w;

    iget-object v1, v0, Lw0/w;->e:Landroid/text/Layout;

    invoke-virtual {v1, p1}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result p1

    iget-object v0, v0, Lw0/w;->e:Landroid/text/Layout;

    invoke-virtual {v0, p1}, Landroid/text/Layout;->getParagraphDirection(I)I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    return v0

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "offset("

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") is out of bounds [0, "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, v1, La1/c;->c:Ljava/lang/Object;

    check-cast p1, Lv0/c;

    iget-object p1, p1, Lv0/c;->d:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x5d

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lv0/y;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lv0/y;

    iget-object v1, p1, Lv0/y;->a:Lv0/x;

    iget-object v3, p0, Lv0/y;->a:Lv0/x;

    invoke-static {v3, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lv0/y;->b:Lv0/i;

    iget-object v3, p1, Lv0/y;->b:Lv0/i;

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lv0/y;->c:J

    iget-wide v5, p1, Lv0/y;->c:J

    invoke-static {v3, v4, v5, v6}, La/a;->x(JJ)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lv0/y;->d:F

    iget v3, p1, Lv0/y;->d:F

    cmpg-float v1, v1, v3

    if-nez v1, :cond_6

    iget v1, p0, Lv0/y;->e:F

    iget v3, p1, Lv0/y;->e:F

    cmpg-float v1, v1, v3

    if-nez v1, :cond_6

    iget-object v1, p0, Lv0/y;->f:Ljava/util/ArrayList;

    iget-object p1, p1, Lv0/y;->f:Ljava/util/ArrayList;

    invoke-static {v1, p1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0

    :cond_6
    return v2
.end method

.method public final hashCode()I
    .locals 5

    iget-object v0, p0, Lv0/y;->a:Lv0/x;

    invoke-virtual {v0}, Lv0/x;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lv0/y;->b:Lv0/i;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-wide v3, p0, Lv0/y;->c:J

    invoke-static {v2, v1, v3, v4}, LA/a;->b(IIJ)I

    move-result v0

    iget v2, p0, Lv0/y;->d:F

    invoke-static {v2, v0, v1}, Lp/f;->a(FII)I

    move-result v0

    iget v2, p0, Lv0/y;->e:F

    invoke-static {v2, v0, v1}, Lp/f;->a(FII)I

    move-result v0

    iget-object v1, p0, Lv0/y;->f:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TextLayoutResult(layoutInput="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lv0/y;->a:Lv0/x;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", multiParagraph="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lv0/y;->b:Lv0/i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lv0/y;->c:J

    invoke-static {v1, v2}, La/a;->i0(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", firstBaseline="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lv0/y;->d:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", lastBaseline="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lv0/y;->e:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", placeholderRects="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lv0/y;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
