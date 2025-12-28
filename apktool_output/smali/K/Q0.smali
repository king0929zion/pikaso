.class public final Lk/Q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj/p;


# instance fields
.field public d:Lj/i;

.field public e:Lj/j;

.field public final synthetic f:Landroidx/appcompat/widget/Toolbar;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/Toolbar;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk/Q0;->f:Landroidx/appcompat/widget/Toolbar;

    return-void
.end method


# virtual methods
.method public final a(Lj/i;Z)V
    .locals 0

    return-void
.end method

.method public final c(Landroid/content/Context;Lj/i;)V
    .locals 1

    iget-object p1, p0, Lk/Q0;->d:Lj/i;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lk/Q0;->e:Lj/j;

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Lj/i;->d(Lj/j;)Z

    :cond_0
    iput-object p2, p0, Lk/Q0;->d:Lj/i;

    return-void
.end method

.method public final d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final f(Lj/j;)Z
    .locals 6

    iget-object v0, p0, Lk/Q0;->f:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->c()V

    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->k:Lk/v;

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-eq v1, v0, :cond_1

    instance-of v2, v1, Landroid/view/ViewGroup;

    if-eqz v2, :cond_0

    check-cast v1, Landroid/view/ViewGroup;

    iget-object v2, v0, Landroidx/appcompat/widget/Toolbar;->k:Lk/v;

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_0
    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->k:Lk/v;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_1
    iget-object v1, p1, Lj/j;->z:Landroid/view/View;

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    iput-object v1, v0, Landroidx/appcompat/widget/Toolbar;->l:Landroid/view/View;

    iput-object p1, p0, Lk/Q0;->e:Lj/j;

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    const/4 v2, 0x2

    if-eq v1, v0, :cond_4

    instance-of v3, v1, Landroid/view/ViewGroup;

    if-eqz v3, :cond_3

    check-cast v1, Landroid/view/ViewGroup;

    iget-object v3, v0, Landroidx/appcompat/widget/Toolbar;->l:Landroid/view/View;

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_3
    invoke-static {}, Landroidx/appcompat/widget/Toolbar;->g()Lk/R0;

    move-result-object v1

    iget v3, v0, Landroidx/appcompat/widget/Toolbar;->q:I

    and-int/lit8 v3, v3, 0x70

    const v4, 0x800003

    or-int/2addr v3, v4

    iput v3, v1, Lk/R0;->a:I

    iput v2, v1, Lk/R0;->b:I

    iget-object v3, v0, Landroidx/appcompat/widget/Toolbar;->l:Landroid/view/View;

    invoke-virtual {v3, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->l:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_4
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v3, 0x1

    sub-int/2addr v1, v3

    :goto_1
    if-ltz v1, :cond_6

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Lk/R0;

    iget v5, v5, Lk/R0;->b:I

    if-eq v5, v2, :cond_5

    iget-object v5, v0, Landroidx/appcompat/widget/Toolbar;->d:Landroidx/appcompat/widget/ActionMenuView;

    if-eq v4, v5, :cond_5

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeViewAt(I)V

    iget-object v5, v0, Landroidx/appcompat/widget/Toolbar;->H:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    :cond_6
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    iput-boolean v3, p1, Lj/j;->B:Z

    iget-object p1, p1, Lj/j;->n:Lj/i;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lj/i;->o(Z)V

    iget-object p1, v0, Landroidx/appcompat/widget/Toolbar;->l:Landroid/view/View;

    instance-of v2, p1, Li/a;

    if-eqz v2, :cond_8

    check-cast p1, Li/a;

    check-cast p1, Landroidx/appcompat/widget/SearchView;

    iget-boolean v2, p1, Landroidx/appcompat/widget/SearchView;->c0:Z

    if-eqz v2, :cond_7

    goto :goto_2

    :cond_7
    iput-boolean v3, p1, Landroidx/appcompat/widget/SearchView;->c0:Z

    iget-object v2, p1, Landroidx/appcompat/widget/SearchView;->s:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v2}, Landroid/widget/TextView;->getImeOptions()I

    move-result v4

    iput v4, p1, Landroidx/appcompat/widget/SearchView;->d0:I

    const/high16 v5, 0x2000000

    or-int/2addr v4, v5

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setImeOptions(I)V

    const-string v4, ""

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1, v1}, Landroidx/appcompat/widget/SearchView;->setIconified(Z)V

    :cond_8
    :goto_2
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->u()V

    return v3
.end method

.method public final g()V
    .locals 4

    iget-object v0, p0, Lk/Q0;->e:Lj/j;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lk/Q0;->d:Lj/i;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lj/i;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Lk/Q0;->d:Lj/i;

    invoke-virtual {v2, v1}, Lj/i;->getItem(I)Landroid/view/MenuItem;

    move-result-object v2

    iget-object v3, p0, Lk/Q0;->e:Lj/j;

    if-ne v2, v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lk/Q0;->e:Lj/j;

    invoke-virtual {p0, v0}, Lk/Q0;->j(Lj/j;)Z

    :cond_2
    :goto_1
    return-void
.end method

.method public final j(Lj/j;)Z
    .locals 7

    iget-object v0, p0, Lk/Q0;->f:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->l:Landroid/view/View;

    instance-of v2, v1, Li/a;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    check-cast v1, Li/a;

    check-cast v1, Landroidx/appcompat/widget/SearchView;

    iget-object v2, v1, Landroidx/appcompat/widget/SearchView;->s:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    const-string v5, ""

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v2}, Landroid/widget/TextView;->length()I

    move-result v6

    invoke-virtual {v2, v6}, Landroid/widget/EditText;->setSelection(I)V

    iput-object v5, v1, Landroidx/appcompat/widget/SearchView;->b0:Ljava/lang/CharSequence;

    invoke-virtual {v1}, Landroidx/appcompat/widget/SearchView;->clearFocus()V

    invoke-virtual {v1, v4}, Landroidx/appcompat/widget/SearchView;->v(Z)V

    iget v5, v1, Landroidx/appcompat/widget/SearchView;->d0:I

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setImeOptions(I)V

    iput-boolean v3, v1, Landroidx/appcompat/widget/SearchView;->c0:Z

    :cond_0
    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->l:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    iget-object v1, v0, Landroidx/appcompat/widget/Toolbar;->k:Lk/v;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/appcompat/widget/Toolbar;->l:Landroid/view/View;

    iget-object v2, v0, Landroidx/appcompat/widget/Toolbar;->H:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v5

    sub-int/2addr v5, v4

    :goto_0
    if-ltz v5, :cond_1

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/View;

    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    add-int/lit8 v5, v5, -0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    iput-object v1, p0, Lk/Q0;->e:Lj/j;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    iput-boolean v3, p1, Lj/j;->B:Z

    iget-object p1, p1, Lj/j;->n:Lj/i;

    invoke-virtual {p1, v3}, Lj/i;->o(Z)V

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->u()V

    return v4
.end method

.method public final l(Lj/t;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
