.class public abstract LJ1/a;
.super LQ0/a;
.source "SourceFile"


# instance fields
.field public a:LJ1/b;


# virtual methods
.method public g(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z
    .locals 1

    invoke-virtual {p0, p1, p2, p3}, LJ1/a;->r(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)V

    iget-object p1, p0, LJ1/a;->a:LJ1/b;

    if-nez p1, :cond_0

    new-instance p1, LJ1/b;

    invoke-direct {p1, p2}, LJ1/b;-><init>(Landroid/view/View;)V

    iput-object p1, p0, LJ1/a;->a:LJ1/b;

    :cond_0
    iget-object p1, p0, LJ1/a;->a:LJ1/b;

    iget-object p2, p1, LJ1/b;->c:Ljava/lang/Object;

    check-cast p2, Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result p3

    iput p3, p1, LJ1/b;->a:I

    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result p2

    iput p2, p1, LJ1/b;->b:I

    iget-object p1, p0, LJ1/a;->a:LJ1/b;

    iget-object p2, p1, LJ1/b;->c:Ljava/lang/Object;

    check-cast p2, Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result p3

    iget v0, p1, LJ1/b;->a:I

    sub-int/2addr p3, v0

    rsub-int/lit8 p3, p3, 0x0

    sget-object v0, Ld1/K;->a:Ljava/lang/reflect/Field;

    invoke-virtual {p2, p3}, Landroid/view/View;->offsetTopAndBottom(I)V

    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result p3

    iget p1, p1, LJ1/b;->b:I

    sub-int/2addr p3, p1

    rsub-int/lit8 p1, p3, 0x0

    invoke-virtual {p2, p1}, Landroid/view/View;->offsetLeftAndRight(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public r(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)V
    .locals 0

    invoke-virtual {p1, p2, p3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->q(Landroid/view/View;I)V

    return-void
.end method
