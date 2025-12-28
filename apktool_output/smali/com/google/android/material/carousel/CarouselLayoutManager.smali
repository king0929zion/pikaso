.class public Lcom/google/android/material/carousel/CarouselLayoutManager;
.super Lz1/w;
.source "SourceFile"


# instance fields
.field public h:LO1/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lz1/w;-><init>()V

    .line 2
    new-instance v0, LO1/a;

    invoke-direct {v0}, LO1/a;-><init>()V

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0}, Lz1/w;->L()V

    .line 4
    invoke-virtual {p0, v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->P(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnknownNullness"
        }
    .end annotation

    .line 5
    invoke-direct {p0}, Lz1/w;-><init>()V

    .line 6
    new-instance v0, LO1/a;

    invoke-direct {v0}, LO1/a;-><init>()V

    .line 7
    invoke-static {p1, p2, p3, p4}, Lz1/w;->y(Landroid/content/Context;Landroid/util/AttributeSet;II)Lz1/m;

    move-result-object p1

    .line 8
    iget p1, p1, Lz1/m;->b:I

    invoke-virtual {p0, p1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->P(I)V

    .line 9
    invoke-virtual {p0}, Lz1/w;->L()V

    return-void
.end method

.method public static N(Ljava/util/List;FZ)LX1/e;
    .locals 13

    const/4 v0, 0x0

    const/4 v1, -0x1

    const v2, 0x7f7fffff    # Float.MAX_VALUE

    const v3, -0x800001

    const/4 v4, 0x0

    move v7, v1

    move v8, v7

    move v9, v8

    move v10, v9

    move v5, v3

    move v6, v4

    move v3, v2

    move v4, v3

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v11

    if-ge v6, v11, :cond_4

    invoke-interface {p0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LO1/c;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sub-float v11, v0, p1

    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    move-result v11

    cmpg-float v12, v0, p1

    if-gtz v12, :cond_0

    cmpg-float v12, v11, v2

    if-gtz v12, :cond_0

    move v7, v6

    move v2, v11

    :cond_0
    cmpl-float v12, v0, p1

    if-lez v12, :cond_1

    cmpg-float v12, v11, v3

    if-gtz v12, :cond_1

    move v9, v6

    move v3, v11

    :cond_1
    cmpg-float v11, v0, v4

    if-gtz v11, :cond_2

    move v4, v0

    move v8, v6

    :cond_2
    cmpl-float v11, v0, v5

    if-lez v11, :cond_3

    move v5, v0

    move v10, v6

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_4
    if-ne v7, v1, :cond_5

    move v7, v8

    :cond_5
    if-ne v9, v1, :cond_6

    move v9, v10

    :cond_6
    new-instance p1, LX1/e;

    invoke-interface {p0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LO1/c;

    invoke-interface {p0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LO1/c;

    invoke-direct {p1, p2, p0}, LX1/e;-><init>(LO1/c;LO1/c;)V

    return-object p1
.end method


# virtual methods
.method public final C(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    invoke-super {p0, p1}, Lz1/w;->C(Landroid/view/accessibility/AccessibilityEvent;)V

    invoke-virtual {p0}, Lz1/w;->p()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lz1/w;->o(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lz1/w;->x(Landroid/view/View;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    invoke-virtual {p0}, Lz1/w;->p()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Lz1/w;->o(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lz1/w;->x(Landroid/view/View;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    :cond_0
    return-void
.end method

.method public final K(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final O()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->h:LO1/b;

    iget v0, v0, LO1/b;->a:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final P(I)V
    .locals 2

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid orientation:"

    invoke-static {v1, p1}, LA/a;->c(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lz1/w;->a(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->h:LO1/b;

    if-eqz v1, :cond_2

    iget v1, v1, LO1/b;->a:I

    if-eq p1, v1, :cond_5

    :cond_2
    if-eqz p1, :cond_4

    if-ne p1, v0, :cond_3

    new-instance p1, LO1/b;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, LO1/b;-><init>(Lcom/google/android/material/carousel/CarouselLayoutManager;I)V

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "invalid orientation"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, LO1/b;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, LO1/b;-><init>(Lcom/google/android/material/carousel/CarouselLayoutManager;I)V

    :goto_1
    iput-object p1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager;->h:LO1/b;

    invoke-virtual {p0}, Lz1/w;->L()V

    :cond_5
    return-void
.end method

.method public final b()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->O()Z

    move-result v0

    return v0
.end method

.method public final c()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->O()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final f(Lz1/F;)I
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public final g(Lz1/F;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final h(Lz1/F;)I
    .locals 0

    const/4 p1, 0x0

    rsub-int/lit8 p1, p1, 0x0

    return p1
.end method

.method public final i(Lz1/F;)I
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public final j(Lz1/F;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final k(Lz1/F;)I
    .locals 0

    const/4 p1, 0x0

    rsub-int/lit8 p1, p1, 0x0

    return p1
.end method

.method public final l()Lz1/x;
    .locals 2

    new-instance v0, Lz1/x;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Lz1/x;-><init>(II)V

    return-object v0
.end method

.method public final r(Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lz1/w;->r(Landroid/view/View;Landroid/graphics/Rect;)V

    invoke-virtual {p2}, Landroid/graphics/Rect;->centerX()I

    const/4 p1, 0x0

    throw p1
.end method
