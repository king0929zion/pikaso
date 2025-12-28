.class public final LM1/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Ljava/lang/Object;

.field public c:I

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# virtual methods
.method public a(I)I
    .locals 7

    iget v0, p0, LM1/j;->a:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, LM1/j;->b:Ljava/lang/Object;

    check-cast v1, [I

    array-length v2, v1

    const/16 v3, 0xe

    const/4 v4, 0x0

    if-gt v0, v2, :cond_0

    goto :goto_0

    :cond_0
    mul-int/lit8 v2, v2, 0x2

    new-array v0, v2, [I

    new-array v2, v2, [I

    invoke-static {v4, v4, v3, v1, v0}, Ld2/j;->Z(III[I[I)V

    iget-object v1, p0, LM1/j;->d:Ljava/lang/Object;

    check-cast v1, [I

    invoke-static {v4, v4, v3, v1, v2}, Ld2/j;->Z(III[I[I)V

    iput-object v0, p0, LM1/j;->b:Ljava/lang/Object;

    iput-object v2, p0, LM1/j;->d:Ljava/lang/Object;

    :goto_0
    iget v0, p0, LM1/j;->a:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, LM1/j;->a:I

    iget-object v1, p0, LM1/j;->e:Ljava/lang/Object;

    check-cast v1, [I

    array-length v1, v1

    iget v2, p0, LM1/j;->c:I

    if-lt v2, v1, :cond_2

    mul-int/lit8 v1, v1, 0x2

    new-array v2, v1, [I

    move v5, v4

    :goto_1
    if-ge v5, v1, :cond_1

    add-int/lit8 v6, v5, 0x1

    aput v6, v2, v5

    move v5, v6

    goto :goto_1

    :cond_1
    iget-object v1, p0, LM1/j;->e:Ljava/lang/Object;

    check-cast v1, [I

    invoke-static {v4, v4, v3, v1, v2}, Ld2/j;->Z(III[I[I)V

    iput-object v2, p0, LM1/j;->e:Ljava/lang/Object;

    :cond_2
    iget v1, p0, LM1/j;->c:I

    iget-object v2, p0, LM1/j;->e:Ljava/lang/Object;

    check-cast v2, [I

    aget v3, v2, v1

    iput v3, p0, LM1/j;->c:I

    iget-object v3, p0, LM1/j;->b:Ljava/lang/Object;

    check-cast v3, [I

    aput p1, v3, v0

    iget-object p1, p0, LM1/j;->d:Ljava/lang/Object;

    check-cast p1, [I

    aput v1, p1, v0

    aput v0, v2, v1

    aget p1, v3, v0

    :goto_2
    if-lez v0, :cond_3

    add-int/lit8 v2, v0, 0x1

    shr-int/lit8 v2, v2, 0x1

    add-int/lit8 v2, v2, -0x1

    aget v4, v3, v2

    if-le v4, p1, :cond_3

    invoke-virtual {p0, v2, v0}, LM1/j;->h(II)V

    move v0, v2

    goto :goto_2

    :cond_3
    return v1
.end method

.method public b()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LM1/j;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, LM1/j;->c:I

    return v0
.end method

.method public d()Lo2/c;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, LM1/j;->a:I

    return v0
.end method

.method public f(Ld1/l0;Ljava/util/List;)V
    .locals 1

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ld1/X;

    iget-object v0, p2, Ld1/X;->a:Ld1/W;

    invoke-virtual {v0}, Ld1/W;->c()I

    move-result v0

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    iget p1, p0, LM1/j;->c:I

    iget-object p2, p2, Ld1/X;->a:Ld1/W;

    invoke-virtual {p2}, Ld1/W;->b()F

    move-result p2

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, LI1/a;->c(FII)I

    move-result p1

    int-to-float p1, p1

    iget-object p2, p0, LM1/j;->e:Ljava/lang/Object;

    check-cast p2, Landroid/view/View;

    invoke-virtual {p2, p1}, Landroid/view/View;->setTranslationY(F)V

    :cond_1
    return-void
.end method

.method public g()V
    .locals 2

    iget-object v0, p0, LM1/j;->b:Ljava/lang/Object;

    check-cast v0, Ln0/L;

    iget-object v0, v0, Ln0/L;->k:Ll0/h;

    iget-object v1, p0, LM1/j;->e:Ljava/lang/Object;

    check-cast v1, Lp2/h;

    invoke-interface {v1, v0}, Lo2/c;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public h(II)V
    .locals 5

    iget-object v0, p0, LM1/j;->b:Ljava/lang/Object;

    check-cast v0, [I

    iget-object v1, p0, LM1/j;->d:Ljava/lang/Object;

    check-cast v1, [I

    iget-object v2, p0, LM1/j;->e:Ljava/lang/Object;

    check-cast v2, [I

    aget v3, v0, p1

    aget v4, v0, p2

    aput v4, v0, p1

    aput v3, v0, p2

    aget v0, v1, p1

    aget v3, v1, p2

    aput v3, v1, p1

    aput v0, v1, p2

    aget v0, v1, p1

    aput p1, v2, v0

    aget p1, v1, p2

    aput p2, v2, p1

    return-void
.end method
