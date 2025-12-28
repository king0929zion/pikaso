.class public abstract Lz1/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LB0/a;

.field public b:Landroidx/recyclerview/widget/RecyclerView;

.field public final c:LB2/i;

.field public final d:LB2/i;

.field public e:Z

.field public f:I

.field public g:I


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lz1/v;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lz1/v;-><init>(Lz1/w;I)V

    new-instance v1, Lz1/v;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lz1/v;-><init>(Lz1/w;I)V

    new-instance v2, LB2/i;

    invoke-direct {v2, v0}, LB2/i;-><init>(Lz1/v;)V

    iput-object v2, p0, Lz1/w;->c:LB2/i;

    new-instance v0, LB2/i;

    invoke-direct {v0, v1}, LB2/i;-><init>(Lz1/v;)V

    iput-object v0, p0, Lz1/w;->d:LB2/i;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lz1/w;->e:Z

    return-void
.end method

.method public static e(III)I
    .locals 2

    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p0

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_1

    const/high16 v1, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_0

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p0

    :cond_0
    return p0

    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    move-result p0

    return p0
.end method

.method public static x(Landroid/view/View;)I
    .locals 0

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Lz1/x;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    throw p0
.end method

.method public static y(Landroid/content/Context;Landroid/util/AttributeSet;II)Lz1/m;
    .locals 2

    new-instance v0, Lz1/m;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lz1/m;-><init>(I)V

    sget-object v1, Ly1/a;->a:[I

    invoke-virtual {p0, p1, v1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p0

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p3

    iput p3, v0, Lz1/m;->b:I

    const/16 p3, 0xa

    invoke-virtual {p0, p3, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, v0, Lz1/m;->c:I

    const/16 p2, 0x9

    invoke-virtual {p0, p2, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, v0, Lz1/m;->d:Z

    const/16 p2, 0xb

    invoke-virtual {p0, p2, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, v0, Lz1/m;->e:Z

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    return-object v0
.end method


# virtual methods
.method public A()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public B(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    return-void
.end method

.method public C(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 3

    iget-object v0, p0, Lz1/w;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->d:Lz1/C;

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lz1/w;->b:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v2, -0x1

    invoke-virtual {v0, v2}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lz1/w;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v2}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lz1/w;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :cond_2
    :goto_0
    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityRecord;->setScrollable(Z)V

    iget-object p1, p0, Lz1/w;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_1
    return-void
.end method

.method public final D(Landroid/view/View;Le1/j;)V
    .locals 0

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->r(Landroid/view/View;)Lz1/I;

    return-void
.end method

.method public E(Lz1/C;Lz1/F;Landroid/view/View;Le1/j;)V
    .locals 1

    invoke-virtual {p0}, Lz1/w;->c()Z

    move-result p1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    invoke-static {p3}, Lz1/w;->x(Landroid/view/View;)I

    move-result p1

    goto :goto_0

    :cond_0
    move p1, p2

    :goto_0
    invoke-virtual {p0}, Lz1/w;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p3}, Lz1/w;->x(Landroid/view/View;)I

    move-result p3

    goto :goto_1

    :cond_1
    move p3, p2

    :goto_1
    const/4 v0, 0x1

    invoke-static {p2, p1, v0, p3, v0}, Le1/i;->a(ZIIII)Le1/i;

    move-result-object p1

    invoke-virtual {p4, p1}, Le1/j;->i(Le1/i;)V

    return-void
.end method

.method public F(Landroid/os/Parcelable;)V
    .locals 0

    return-void
.end method

.method public G()Landroid/os/Parcelable;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public H(I)V
    .locals 0

    return-void
.end method

.method public final I(Lz1/C;)V
    .locals 7

    invoke-virtual {p0}, Lz1/w;->p()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_4

    invoke-virtual {p0, v0}, Lz1/w;->o(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Landroidx/recyclerview/widget/RecyclerView;->r(Landroid/view/View;)Lz1/I;

    move-result-object v1

    invoke-virtual {v1}, Lz1/I;->o()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p0, v0}, Lz1/w;->o(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v0}, Lz1/w;->o(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lz1/w;->a:LB0/a;

    invoke-virtual {v2, v0}, LB0/a;->q(I)I

    move-result v3

    iget-object v4, v2, LB0/a;->b:Ljava/lang/Object;

    check-cast v4, Lz1/p;

    iget-object v5, v4, Lz1/p;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    if-nez v5, :cond_0

    goto :goto_1

    :cond_0
    iget-object v6, v2, LB0/a;->c:Ljava/lang/Object;

    check-cast v6, Lz1/b;

    invoke-virtual {v6, v3}, Lz1/b;->e(I)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {v2, v5}, LB0/a;->L(Landroid/view/View;)V

    :cond_1
    invoke-virtual {v4, v3}, Lz1/p;->a(I)V

    :cond_2
    :goto_1
    invoke-virtual {p1, v1}, Lz1/C;->e(Landroid/view/View;)V

    :cond_3
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final J(Lz1/C;)V
    .locals 6

    iget-object v0, p1, Lz1/C;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v1, v0, -0x1

    :goto_0
    iget-object v2, p1, Lz1/C;->a:Ljava/util/ArrayList;

    if-ltz v1, :cond_3

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz1/I;

    const/4 v3, 0x0

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, Landroidx/recyclerview/widget/RecyclerView;->r(Landroid/view/View;)Lz1/I;

    move-result-object v2

    invoke-virtual {v2}, Lz1/I;->o()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Lz1/I;->n(Z)V

    invoke-virtual {v2}, Lz1/I;->k()Z

    move-result v5

    if-eqz v5, :cond_1

    iget-object v5, p0, Lz1/w;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v5, v3, v4}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    :cond_1
    iget-object v5, p0, Lz1/w;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v5, v5, Landroidx/recyclerview/widget/RecyclerView;->H:Lz1/t;

    if-eqz v5, :cond_2

    invoke-virtual {v5, v2}, Lz1/t;->b(Lz1/I;)V

    :cond_2
    const/4 v5, 0x1

    invoke-virtual {v2, v5}, Lz1/I;->n(Z)V

    invoke-static {v3}, Landroidx/recyclerview/widget/RecyclerView;->r(Landroid/view/View;)Lz1/I;

    move-result-object v2

    const/4 v3, 0x0

    iput-object v3, v2, Lz1/I;->c:Lz1/C;

    iput-boolean v4, v2, Lz1/I;->d:Z

    iget v3, v2, Lz1/I;->b:I

    and-int/lit8 v3, v3, -0x21

    iput v3, v2, Lz1/I;->b:I

    invoke-virtual {p1, v2}, Lz1/C;->f(Lz1/I;)V

    :goto_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    iget-object p1, p1, Lz1/C;->b:Ljava/util/ArrayList;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    :cond_4
    if-lez v0, :cond_5

    iget-object p1, p0, Lz1/w;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_5
    return-void
.end method

.method public K(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z
    .locals 8

    invoke-virtual {p0}, Lz1/w;->u()I

    move-result v0

    invoke-virtual {p0}, Lz1/w;->w()I

    move-result v1

    iget v2, p0, Lz1/w;->f:I

    invoke-virtual {p0}, Lz1/w;->v()I

    move-result v3

    sub-int/2addr v2, v3

    iget v3, p0, Lz1/w;->g:I

    invoke-virtual {p0}, Lz1/w;->t()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result v4

    iget v5, p3, Landroid/graphics/Rect;->left:I

    add-int/2addr v4, v5

    invoke-virtual {p2}, Landroid/view/View;->getScrollX()I

    move-result v5

    sub-int/2addr v4, v5

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v5

    iget v6, p3, Landroid/graphics/Rect;->top:I

    add-int/2addr v5, v6

    invoke-virtual {p2}, Landroid/view/View;->getScrollY()I

    move-result p2

    sub-int/2addr v5, p2

    invoke-virtual {p3}, Landroid/graphics/Rect;->width()I

    move-result p2

    add-int/2addr p2, v4

    invoke-virtual {p3}, Landroid/graphics/Rect;->height()I

    move-result p3

    add-int/2addr p3, v5

    sub-int/2addr v4, v0

    const/4 v0, 0x0

    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    move-result v6

    sub-int/2addr v5, v1

    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    move-result v1

    sub-int/2addr p2, v2

    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result v2

    sub-int/2addr p3, v3

    invoke-static {v0, p3}, Ljava/lang/Math;->max(II)I

    move-result p3

    invoke-virtual {p0}, Lz1/w;->s()I

    move-result v3

    const/4 v7, 0x1

    if-ne v3, v7, :cond_1

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v6, p2}, Ljava/lang/Math;->max(II)I

    move-result v2

    goto :goto_1

    :cond_1
    if-eqz v6, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v4, v2}, Ljava/lang/Math;->min(II)I

    move-result v6

    :goto_0
    move v2, v6

    :goto_1
    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {v5, p3}, Ljava/lang/Math;->min(II)I

    move-result v1

    :goto_2
    filled-new-array {v2, v1}, [I

    move-result-object p2

    aget p3, p2, v0

    aget p2, p2, v7

    if-eqz p5, :cond_5

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    move-result-object p5

    if-nez p5, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {p0}, Lz1/w;->u()I

    move-result v1

    invoke-virtual {p0}, Lz1/w;->w()I

    move-result v2

    iget v3, p0, Lz1/w;->f:I

    invoke-virtual {p0}, Lz1/w;->v()I

    move-result v4

    sub-int/2addr v3, v4

    iget v4, p0, Lz1/w;->g:I

    invoke-virtual {p0}, Lz1/w;->t()I

    move-result v5

    sub-int/2addr v4, v5

    iget-object v5, p0, Lz1/w;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v5, v5, Landroidx/recyclerview/widget/RecyclerView;->j:Landroid/graphics/Rect;

    invoke-virtual {p0, p5, v5}, Lz1/w;->r(Landroid/view/View;Landroid/graphics/Rect;)V

    iget p5, v5, Landroid/graphics/Rect;->left:I

    sub-int/2addr p5, p3

    if-ge p5, v3, :cond_6

    iget p5, v5, Landroid/graphics/Rect;->right:I

    sub-int/2addr p5, p3

    if-le p5, v1, :cond_6

    iget p5, v5, Landroid/graphics/Rect;->top:I

    sub-int/2addr p5, p2

    if-ge p5, v4, :cond_6

    iget p5, v5, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p5, p2

    if-gt p5, v2, :cond_5

    goto :goto_3

    :cond_5
    if-nez p3, :cond_7

    if-eqz p2, :cond_6

    goto :goto_4

    :cond_6
    :goto_3
    return v0

    :cond_7
    :goto_4
    if-eqz p4, :cond_8

    invoke-virtual {p1, p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    goto :goto_5

    :cond_8
    invoke-virtual {p1, p3, p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->B(IIZ)V

    :goto_5
    return v7
.end method

.method public final L()V
    .locals 1

    iget-object v0, p0, Lz1/w;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    :cond_0
    return-void
.end method

.method public final M(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lz1/w;->b:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p1, p0, Lz1/w;->a:LB0/a;

    const/4 p1, 0x0

    iput p1, p0, Lz1/w;->f:I

    iput p1, p0, Lz1/w;->g:I

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lz1/w;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView;->g:LB0/a;

    iput-object v0, p0, Lz1/w;->a:LB0/a;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    iput v0, p0, Lz1/w;->f:I

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    iput p1, p0, Lz1/w;->g:I

    :goto_0
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lz1/w;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->c(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public abstract b()Z
.end method

.method public abstract c()Z
.end method

.method public d(Lz1/x;)Z
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public abstract f(Lz1/F;)I
.end method

.method public abstract g(Lz1/F;)I
.end method

.method public abstract h(Lz1/F;)I
.end method

.method public abstract i(Lz1/F;)I
.end method

.method public abstract j(Lz1/F;)I
.end method

.method public abstract k(Lz1/F;)I
.end method

.method public abstract l()Lz1/x;
.end method

.method public m(Landroid/content/Context;Landroid/util/AttributeSet;)Lz1/x;
    .locals 1

    new-instance v0, Lz1/x;

    invoke-direct {v0, p1, p2}, Lz1/x;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public n(Landroid/view/ViewGroup$LayoutParams;)Lz1/x;
    .locals 1

    instance-of v0, p1, Lz1/x;

    if-eqz v0, :cond_0

    new-instance v0, Lz1/x;

    check-cast p1, Lz1/x;

    invoke-direct {v0, p1}, Lz1/x;-><init>(Lz1/x;)V

    return-object v0

    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_1

    new-instance v0, Lz1/x;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, Lz1/x;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object v0

    :cond_1
    new-instance v0, Lz1/x;

    invoke-direct {v0, p1}, Lz1/x;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public final o(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lz1/w;->a:LB0/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LB0/a;->q(I)I

    move-result p1

    iget-object v0, v0, LB0/a;->b:Ljava/lang/Object;

    check-cast v0, Lz1/p;

    iget-object v0, v0, Lz1/p;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final p()I
    .locals 2

    iget-object v0, p0, Lz1/w;->a:LB0/a;

    if-eqz v0, :cond_0

    iget-object v1, v0, LB0/a;->b:Ljava/lang/Object;

    check-cast v1, Lz1/p;

    iget-object v1, v1, Lz1/p;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    iget-object v0, v0, LB0/a;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr v1, v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public q(Lz1/C;Lz1/F;)I
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public r(Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 6

    sget-object v0, Landroidx/recyclerview/widget/RecyclerView;->m0:[I

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lz1/x;

    iget-object v1, v0, Lz1/x;->a:Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v2

    iget v3, v1, Landroid/graphics/Rect;->left:I

    sub-int/2addr v2, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    sub-int/2addr v2, v3

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v3

    iget v4, v1, Landroid/graphics/Rect;->top:I

    sub-int/2addr v3, v4

    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    sub-int/2addr v3, v4

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v4

    iget v5, v1, Landroid/graphics/Rect;->right:I

    add-int/2addr v4, v5

    iget v5, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v4, v5

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result p1

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr p1, v1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr p1, v0

    invoke-virtual {p2, v2, v3, v4, p1}, Landroid/graphics/Rect;->set(IIII)V

    return-void
.end method

.method public final s()I
    .locals 2

    iget-object v0, p0, Lz1/w;->b:Landroidx/recyclerview/widget/RecyclerView;

    sget-object v1, Ld1/K;->a:Ljava/lang/reflect/Field;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    move-result v0

    return v0
.end method

.method public final t()I
    .locals 1

    iget-object v0, p0, Lz1/w;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final u()I
    .locals 1

    iget-object v0, p0, Lz1/w;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final v()I
    .locals 1

    iget-object v0, p0, Lz1/w;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final w()I
    .locals 1

    iget-object v0, p0, Lz1/w;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public z(Lz1/C;Lz1/F;)I
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
