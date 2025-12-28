.class public final Lj/s;
.super Lj/k;
.source "SourceFile"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field public final e:Landroid/content/Context;

.field public final f:Lj/i;

.field public final g:Lj/g;

.field public final h:Z

.field public final i:I

.field public final j:I

.field public final k:Lk/s0;

.field public final l:Lj/c;

.field public final m:La2/n;

.field public n:Lj/l;

.field public o:Landroid/view/View;

.field public p:Landroid/view/View;

.field public q:Lj/o;

.field public r:Landroid/view/ViewTreeObserver;

.field public s:Z

.field public t:Z

.field public u:I

.field public v:I

.field public w:Z


# direct methods
.method public constructor <init>(ILandroid/content/Context;Landroid/view/View;Lj/i;Z)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lj/c;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lj/c;-><init>(Lj/k;I)V

    iput-object v0, p0, Lj/s;->l:Lj/c;

    new-instance v0, La2/n;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0}, La2/n;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Lj/s;->m:La2/n;

    const/4 v0, 0x0

    iput v0, p0, Lj/s;->v:I

    iput-object p2, p0, Lj/s;->e:Landroid/content/Context;

    iput-object p4, p0, Lj/s;->f:Lj/i;

    iput-boolean p5, p0, Lj/s;->h:Z

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    new-instance v1, Lj/g;

    const v2, 0x7f0b0013

    invoke-direct {v1, p4, v0, p5, v2}, Lj/g;-><init>(Lj/i;Landroid/view/LayoutInflater;ZI)V

    iput-object v1, p0, Lj/s;->g:Lj/g;

    iput p1, p0, Lj/s;->j:I

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p5

    invoke-virtual {p5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 v0, v0, 0x2

    const v1, 0x7f060017

    invoke-virtual {p5, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p5

    invoke-static {v0, p5}, Ljava/lang/Math;->max(II)I

    move-result p5

    iput p5, p0, Lj/s;->i:I

    iput-object p3, p0, Lj/s;->o:Landroid/view/View;

    new-instance p3, Lk/s0;

    invoke-direct {p3, p2, p1}, Lk/m0;-><init>(Landroid/content/Context;I)V

    iput-object p3, p0, Lj/s;->k:Lk/s0;

    invoke-virtual {p4, p0, p2}, Lj/i;->b(Lj/p;Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final a(Lj/i;Z)V
    .locals 1

    iget-object v0, p0, Lj/s;->f:Lj/i;

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lj/s;->e()V

    iget-object v0, p0, Lj/s;->q:Lj/o;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, Lj/o;->a(Lj/i;Z)V

    :cond_1
    return-void
.end method

.method public final b()V
    .locals 8

    invoke-virtual {p0}, Lj/s;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-boolean v0, p0, Lj/s;->s:Z

    if-nez v0, :cond_8

    iget-object v0, p0, Lj/s;->o:Landroid/view/View;

    if-eqz v0, :cond_8

    iput-object v0, p0, Lj/s;->p:Landroid/view/View;

    iget-object v0, p0, Lj/s;->k:Lk/s0;

    iget-object v1, v0, Lk/m0;->y:Lk/x;

    invoke-virtual {v1, p0}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    iput-object p0, v0, Lk/m0;->p:Lj/k;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lk/m0;->x:Z

    iget-object v2, v0, Lk/m0;->y:Lk/x;

    invoke-virtual {v2, v1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    iget-object v2, p0, Lj/s;->p:Landroid/view/View;

    iget-object v3, p0, Lj/s;->r:Landroid/view/ViewTreeObserver;

    const/4 v4, 0x0

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_0

    :cond_1
    move v3, v4

    :goto_0
    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v5

    iput-object v5, p0, Lj/s;->r:Landroid/view/ViewTreeObserver;

    if-eqz v3, :cond_2

    iget-object v3, p0, Lj/s;->l:Lj/c;

    invoke-virtual {v5, v3}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_2
    iget-object v3, p0, Lj/s;->m:La2/n;

    invoke-virtual {v2, v3}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iput-object v2, v0, Lk/m0;->o:Landroid/view/View;

    iget v2, p0, Lj/s;->v:I

    iput v2, v0, Lk/m0;->m:I

    iget-boolean v2, p0, Lj/s;->t:Z

    iget-object v3, p0, Lj/s;->e:Landroid/content/Context;

    iget-object v5, p0, Lj/s;->g:Lj/g;

    if-nez v2, :cond_3

    iget v2, p0, Lj/s;->i:I

    invoke-static {v5, v3, v2}, Lj/k;->n(Landroid/widget/ListAdapter;Landroid/content/Context;I)I

    move-result v2

    iput v2, p0, Lj/s;->u:I

    iput-boolean v1, p0, Lj/s;->t:Z

    :cond_3
    iget v1, p0, Lj/s;->u:I

    iget-object v2, v0, Lk/m0;->y:Lk/x;

    invoke-virtual {v2}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_4

    iget-object v6, v0, Lk/m0;->v:Landroid/graphics/Rect;

    invoke-virtual {v2, v6}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    iget v2, v6, Landroid/graphics/Rect;->left:I

    iget v6, v6, Landroid/graphics/Rect;->right:I

    add-int/2addr v2, v6

    add-int/2addr v2, v1

    iput v2, v0, Lk/m0;->g:I

    goto :goto_1

    :cond_4
    iput v1, v0, Lk/m0;->g:I

    :goto_1
    const/4 v1, 0x2

    iget-object v2, v0, Lk/m0;->y:Lk/x;

    invoke-virtual {v2, v1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    iget-object v1, p0, Lj/k;->d:Landroid/graphics/Rect;

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    new-instance v6, Landroid/graphics/Rect;

    invoke-direct {v6, v1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    goto :goto_2

    :cond_5
    move-object v6, v2

    :goto_2
    iput-object v6, v0, Lk/m0;->w:Landroid/graphics/Rect;

    invoke-virtual {v0}, Lk/m0;->b()V

    iget-object v1, v0, Lk/m0;->f:Lk/r0;

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    iget-boolean v6, p0, Lj/s;->w:Z

    if-eqz v6, :cond_7

    iget-object v6, p0, Lj/s;->f:Lj/i;

    iget-object v7, v6, Lj/i;->l:Ljava/lang/CharSequence;

    if-eqz v7, :cond_7

    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    const v7, 0x7f0b0012

    invoke-virtual {v3, v7, v1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/FrameLayout;

    const v7, 0x1020016

    invoke-virtual {v3, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    if-eqz v7, :cond_6

    iget-object v6, v6, Lj/i;->l:Ljava/lang/CharSequence;

    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_6
    invoke-virtual {v3, v4}, Landroid/view/View;->setEnabled(Z)V

    invoke-virtual {v1, v3, v2, v4}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    :cond_7
    invoke-virtual {v0, v5}, Lk/m0;->a(Landroid/widget/ListAdapter;)V

    invoke-virtual {v0}, Lk/m0;->b()V

    :goto_3
    return-void

    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "StandardMenuPopup cannot be used without an anchor"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final e()V
    .locals 1

    invoke-virtual {p0}, Lj/s;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj/s;->k:Lk/s0;

    invoke-virtual {v0}, Lk/m0;->e()V

    :cond_0
    return-void
.end method

.method public final g()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lj/s;->t:Z

    iget-object v0, p0, Lj/s;->g:Lj/g;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj/g;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public final h()Z
    .locals 1

    iget-boolean v0, p0, Lj/s;->s:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lj/s;->k:Lk/s0;

    iget-object v0, v0, Lk/m0;->y:Lk/x;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final i()Landroid/widget/ListView;
    .locals 1

    iget-object v0, p0, Lj/s;->k:Lk/s0;

    iget-object v0, v0, Lk/m0;->f:Lk/r0;

    return-object v0
.end method

.method public final k(Lj/o;)V
    .locals 0

    iput-object p1, p0, Lj/s;->q:Lj/o;

    return-void
.end method

.method public final l(Lj/t;)Z
    .locals 8

    invoke-virtual {p1}, Lj/i;->hasVisibleItems()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_7

    new-instance v0, Lj/n;

    iget-object v5, p0, Lj/s;->p:Landroid/view/View;

    iget-object v4, p0, Lj/s;->e:Landroid/content/Context;

    iget-boolean v7, p0, Lj/s;->h:Z

    iget v3, p0, Lj/s;->j:I

    move-object v2, v0

    move-object v6, p1

    invoke-direct/range {v2 .. v7}, Lj/n;-><init>(ILandroid/content/Context;Landroid/view/View;Lj/i;Z)V

    iget-object v2, p0, Lj/s;->q:Lj/o;

    iput-object v2, v0, Lj/n;->h:Lj/o;

    iget-object v3, v0, Lj/n;->i:Lj/k;

    if-eqz v3, :cond_0

    invoke-interface {v3, v2}, Lj/p;->k(Lj/o;)V

    :cond_0
    invoke-static {p1}, Lj/k;->v(Lj/i;)Z

    move-result v2

    iput-boolean v2, v0, Lj/n;->g:Z

    iget-object v3, v0, Lj/n;->i:Lj/k;

    if-eqz v3, :cond_1

    invoke-virtual {v3, v2}, Lj/k;->p(Z)V

    :cond_1
    iget-object v2, p0, Lj/s;->n:Lj/l;

    iput-object v2, v0, Lj/n;->j:Lj/l;

    const/4 v2, 0x0

    iput-object v2, p0, Lj/s;->n:Lj/l;

    iget-object v2, p0, Lj/s;->f:Lj/i;

    invoke-virtual {v2, v1}, Lj/i;->c(Z)V

    iget-object v2, p0, Lj/s;->k:Lk/s0;

    iget v3, v2, Lk/m0;->h:I

    iget-boolean v4, v2, Lk/m0;->j:Z

    if-nez v4, :cond_2

    move v2, v1

    goto :goto_0

    :cond_2
    iget v2, v2, Lk/m0;->i:I

    :goto_0
    iget v4, p0, Lj/s;->v:I

    iget-object v5, p0, Lj/s;->o:Landroid/view/View;

    sget-object v6, Ld1/K;->a:Ljava/lang/reflect/Field;

    invoke-virtual {v5}, Landroid/view/View;->getLayoutDirection()I

    move-result v5

    invoke-static {v4, v5}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v4

    and-int/lit8 v4, v4, 0x7

    const/4 v5, 0x5

    if-ne v4, v5, :cond_3

    iget-object v4, p0, Lj/s;->o:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v4

    add-int/2addr v3, v4

    :cond_3
    invoke-virtual {v0}, Lj/n;->b()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_4

    goto :goto_1

    :cond_4
    iget-object v4, v0, Lj/n;->e:Landroid/view/View;

    if-nez v4, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v0, v3, v2, v5, v5}, Lj/n;->d(IIZZ)V

    :goto_1
    iget-object v0, p0, Lj/s;->q:Lj/o;

    if-eqz v0, :cond_6

    invoke-interface {v0, p1}, Lj/o;->c(Lj/i;)Z

    :cond_6
    return v5

    :cond_7
    :goto_2
    return v1
.end method

.method public final m(Lj/i;)V
    .locals 0

    return-void
.end method

.method public final o(Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lj/s;->o:Landroid/view/View;

    return-void
.end method

.method public final onDismiss()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lj/s;->s:Z

    iget-object v1, p0, Lj/s;->f:Lj/i;

    invoke-virtual {v1, v0}, Lj/i;->c(Z)V

    iget-object v0, p0, Lj/s;->r:Landroid/view/ViewTreeObserver;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lj/s;->p:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iput-object v0, p0, Lj/s;->r:Landroid/view/ViewTreeObserver;

    :cond_0
    iget-object v0, p0, Lj/s;->r:Landroid/view/ViewTreeObserver;

    iget-object v1, p0, Lj/s;->l:Lj/c;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lj/s;->r:Landroid/view/ViewTreeObserver;

    :cond_1
    iget-object v0, p0, Lj/s;->p:Landroid/view/View;

    iget-object v1, p0, Lj/s;->m:La2/n;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iget-object v0, p0, Lj/s;->n:Lj/l;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lj/l;->onDismiss()V

    :cond_2
    return-void
.end method

.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 p3, 0x1

    if-ne p1, p3, :cond_0

    const/16 p1, 0x52

    if-ne p2, p1, :cond_0

    invoke-virtual {p0}, Lj/s;->e()V

    return p3

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final p(Z)V
    .locals 1

    iget-object v0, p0, Lj/s;->g:Lj/g;

    iput-boolean p1, v0, Lj/g;->f:Z

    return-void
.end method

.method public final q(I)V
    .locals 0

    iput p1, p0, Lj/s;->v:I

    return-void
.end method

.method public final r(I)V
    .locals 1

    iget-object v0, p0, Lj/s;->k:Lk/s0;

    iput p1, v0, Lk/m0;->h:I

    return-void
.end method

.method public final s(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 0

    check-cast p1, Lj/l;

    iput-object p1, p0, Lj/s;->n:Lj/l;

    return-void
.end method

.method public final t(Z)V
    .locals 0

    iput-boolean p1, p0, Lj/s;->w:Z

    return-void
.end method

.method public final u(I)V
    .locals 1

    iget-object v0, p0, Lj/s;->k:Lk/s0;

    iput p1, v0, Lk/m0;->i:I

    const/4 p1, 0x1

    iput-boolean p1, v0, Lk/m0;->j:Z

    return-void
.end method
