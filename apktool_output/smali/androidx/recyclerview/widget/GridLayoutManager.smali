.class public Landroidx/recyclerview/widget/GridLayoutManager;
.super Landroidx/recyclerview/widget/LinearLayoutManager;
.source "SourceFile"


# instance fields
.field public q:I

.field public final r:Lk/H;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 2

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const/4 v0, -0x1

    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->q:I

    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    new-instance v0, Lk/H;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lk/H;-><init>(I)V

    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->r:Lk/H;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    invoke-static {p1, p2, p3, p4}, Lz1/w;->y(Landroid/content/Context;Landroid/util/AttributeSet;II)Lz1/m;

    move-result-object p1

    iget p1, p1, Lz1/m;->c:I

    iget p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->q:I

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x1

    if-lt p1, p2, :cond_1

    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->q:I

    iget-object p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->r:Lk/H;

    iget-object p1, p1, Lk/H;->b:Ljava/lang/Object;

    check-cast p1, Landroid/util/SparseIntArray;

    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    invoke-virtual {p0}, Lz1/w;->L()V

    :goto_0
    return-void

    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string p3, "Span count should be at least 1. Provided "

    invoke-static {p3, p1}, LA/a;->c(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public final E(Lz1/C;Lz1/F;Landroid/view/View;Le1/j;)V
    .locals 0

    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    instance-of p2, p1, Lz1/l;

    if-nez p2, :cond_0

    invoke-virtual {p0, p3, p4}, Lz1/w;->D(Landroid/view/View;Le1/j;)V

    return-void

    :cond_0
    check-cast p1, Lz1/l;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    throw p1
.end method

.method public final V(Z)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->V(Z)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "GridLayoutManager does not support stack from end. Consider using reverse layout"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final W(Lz1/C;Lz1/F;I)I
    .locals 2

    iget-boolean p2, p2, Lz1/F;->f:Z

    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->r:Lk/H;

    if-nez p2, :cond_0

    iget p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->q:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p3, p1}, Lk/H;->k(II)I

    move-result p1

    return p1

    :cond_0
    iget-object p1, p1, Lz1/C;->g:Landroidx/recyclerview/widget/RecyclerView;

    if-ltz p3, :cond_3

    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView;->b0:Lz1/F;

    invoke-virtual {p2}, Lz1/F;->a()I

    move-result p2

    if-ge p3, p2, :cond_3

    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView;->b0:Lz1/F;

    iget-boolean p2, p2, Lz1/F;->f:Z

    if-nez p2, :cond_1

    move p1, p3

    goto :goto_0

    :cond_1
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->f:LB0/a;

    const/4 p2, 0x0

    invoke-virtual {p1, p3, p2}, LB0/a;->h(II)I

    move-result p1

    :goto_0
    const/4 p2, -0x1

    if-ne p1, p2, :cond_2

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Cannot find span size for pre layout position. "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "GridLayoutManager"

    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return p1

    :cond_2
    iget p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->q:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, p2}, Lk/H;->k(II)I

    move-result p1

    return p1

    :cond_3
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "invalid position "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ". State item count is "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p1, Landroidx/recyclerview/widget/RecyclerView;->b0:Lz1/F;

    invoke-virtual {p3}, Lz1/F;->a()I

    move-result p3

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->o()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final d(Lz1/x;)Z
    .locals 0

    instance-of p1, p1, Lz1/l;

    return p1
.end method

.method public final g(Lz1/F;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->O(Lz1/F;)I

    move-result p1

    return p1
.end method

.method public final h(Lz1/F;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->P(Lz1/F;)I

    move-result p1

    return p1
.end method

.method public final j(Lz1/F;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->O(Lz1/F;)I

    move-result p1

    return p1
.end method

.method public final k(Lz1/F;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->P(Lz1/F;)I

    move-result p1

    return p1
.end method

.method public final l()Lz1/x;
    .locals 3

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->h:I

    const/4 v1, -0x1

    const/4 v2, -0x2

    if-nez v0, :cond_0

    new-instance v0, Lz1/l;

    invoke-direct {v0, v2, v1}, Lz1/l;-><init>(II)V

    return-object v0

    :cond_0
    new-instance v0, Lz1/l;

    invoke-direct {v0, v1, v2}, Lz1/l;-><init>(II)V

    return-object v0
.end method

.method public final m(Landroid/content/Context;Landroid/util/AttributeSet;)Lz1/x;
    .locals 1

    new-instance v0, Lz1/l;

    invoke-direct {v0, p1, p2}, Lz1/x;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, -0x1

    iput p1, v0, Lz1/l;->c:I

    const/4 p1, 0x0

    iput p1, v0, Lz1/l;->d:I

    return-object v0
.end method

.method public final n(Landroid/view/ViewGroup$LayoutParams;)Lz1/x;
    .locals 3

    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-eqz v0, :cond_0

    new-instance v0, Lz1/l;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, Lz1/x;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    iput v2, v0, Lz1/l;->c:I

    iput v1, v0, Lz1/l;->d:I

    return-object v0

    :cond_0
    new-instance v0, Lz1/l;

    invoke-direct {v0, p1}, Lz1/x;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    iput v2, v0, Lz1/l;->c:I

    iput v1, v0, Lz1/l;->d:I

    return-object v0
.end method

.method public final q(Lz1/C;Lz1/F;)I
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->h:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->q:I

    return p1

    :cond_0
    invoke-virtual {p2}, Lz1/F;->a()I

    move-result v0

    if-ge v0, v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-virtual {p2}, Lz1/F;->a()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-virtual {p0, p1, p2, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->W(Lz1/C;Lz1/F;I)I

    move-result p1

    add-int/2addr p1, v1

    return p1
.end method

.method public final z(Lz1/C;Lz1/F;)I
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->h:I

    if-nez v0, :cond_0

    iget p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->q:I

    return p1

    :cond_0
    invoke-virtual {p2}, Lz1/F;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-virtual {p2}, Lz1/F;->a()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-virtual {p0, p1, p2, v0}, Landroidx/recyclerview/widget/GridLayoutManager;->W(Lz1/C;Lz1/F;I)I

    move-result p1

    add-int/2addr p1, v1

    return p1
.end method
