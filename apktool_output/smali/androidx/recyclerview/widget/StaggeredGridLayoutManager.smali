.class public Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
.super Lz1/w;
.source "SourceFile"


# instance fields
.field public final h:I

.field public final i:[Lz1/O;

.field public final j:Lv1/b;

.field public final k:Lv1/b;

.field public final l:I

.field public final m:Z

.field public final n:Z

.field public final o:LD/K0;

.field public final p:I

.field public q:Lz1/N;

.field public final r:Z

.field public final s:LM1/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 5

    invoke-direct {p0}, Lz1/w;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:Z

    iput-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->n:Z

    new-instance v1, LD/K0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->o:LD/K0;

    const/4 v2, 0x2

    iput v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->p:I

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    new-instance v2, Ls1/c;

    invoke-direct {v2, p0}, Ls1/c;-><init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;)V

    const/4 v2, 0x1

    iput-boolean v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Z

    new-instance v3, LM1/h;

    const/16 v4, 0xb

    invoke-direct {v3, v4, p0}, LM1/h;-><init>(ILjava/lang/Object;)V

    iput-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->s:LM1/h;

    invoke-static {p1, p2, p3, p4}, Lz1/w;->y(Landroid/content/Context;Landroid/util/AttributeSet;II)Lz1/m;

    move-result-object p1

    iget p2, p1, Lz1/m;->b:I

    if-eqz p2, :cond_1

    if-ne p2, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "invalid orientation."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    const/4 p3, 0x0

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Ljava/lang/String;)V

    iget p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    if-ne p2, p4, :cond_2

    goto :goto_1

    :cond_2
    iput p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:Lv1/b;

    iget-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:Lv1/b;

    iput-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:Lv1/b;

    iput-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:Lv1/b;

    invoke-virtual {p0}, Lz1/w;->L()V

    :goto_1
    iget p2, p1, Lz1/m;->c:I

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Ljava/lang/String;)V

    iget p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    if-eq p2, p4, :cond_4

    iput-object p3, v1, LD/K0;->a:Ljava/util/ArrayList;

    invoke-virtual {p0}, Lz1/w;->L()V

    iput p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    new-instance p2, Ljava/util/BitSet;

    iget p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    invoke-direct {p2, p4}, Ljava/util/BitSet;-><init>(I)V

    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    new-array p2, p2, [Lz1/O;

    iput-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:[Lz1/O;

    move p2, v0

    :goto_2
    iget p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    if-ge p2, p4, :cond_3

    iget-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:[Lz1/O;

    new-instance v1, Lz1/O;

    invoke-direct {v1, p0, p2}, Lz1/O;-><init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;I)V

    aput-object v1, p4, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    :cond_3
    invoke-virtual {p0}, Lz1/w;->L()V

    :cond_4
    iget-boolean p1, p1, Lz1/m;->d:Z

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a(Ljava/lang/String;)V

    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q:Lz1/N;

    if-eqz p2, :cond_5

    iget-boolean p3, p2, Lz1/N;->k:Z

    if-eq p3, p1, :cond_5

    iput-boolean p1, p2, Lz1/N;->k:Z

    :cond_5
    iput-boolean p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:Z

    invoke-virtual {p0}, Lz1/w;->L()V

    new-instance p1, Ld1/n;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ld1/n;-><init>(I)V

    iput v0, p1, Ld1/n;->b:I

    iput v0, p1, Ld1/n;->c:I

    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    invoke-static {p0, p1}, Lv1/b;->a(Lz1/w;I)Lv1/b;

    move-result-object p1

    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:Lv1/b;

    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    sub-int/2addr v2, p1

    invoke-static {p0, v2}, Lv1/b;->a(Lz1/w;I)Lv1/b;

    move-result-object p1

    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->k:Lv1/b;

    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->p:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final B(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 3

    iget-object v0, p0, Lz1/w;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->s:LM1/h;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:[Lz1/O;

    aget-object v1, v1, v0

    iget-object v2, v1, Lz1/O;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    const/high16 v2, -0x80000000

    iput v2, v1, Lz1/O;->b:I

    iput v2, v1, Lz1/O;->c:I

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    return-void
.end method

.method public final C(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 2

    invoke-super {p0, p1}, Lz1/w;->C(Landroid/view/accessibility/AccessibilityEvent;)V

    invoke-virtual {p0}, Lz1/w;->p()I

    move-result v0

    if-lez v0, :cond_2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->S(Z)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->R(Z)Landroid/view/View;

    move-result-object v0

    if-eqz v1, :cond_2

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lz1/w;->x(Landroid/view/View;)I

    move-result v1

    invoke-static {v0}, Lz1/w;->x(Landroid/view/View;)I

    move-result v0

    if-ge v1, v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    nop

    :cond_2
    :goto_0
    return-void
.end method

.method public final E(Lz1/C;Lz1/F;Landroid/view/View;Le1/j;)V
    .locals 2

    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    instance-of p2, p1, Lz1/L;

    if-nez p2, :cond_0

    invoke-virtual {p0, p3, p4}, Lz1/w;->D(Landroid/view/View;Le1/j;)V

    return-void

    :cond_0
    check-cast p1, Lz1/L;

    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, -0x1

    if-nez p2, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v1, p3, v1, v1}, Le1/i;->a(ZIIII)Le1/i;

    move-result-object p1

    invoke-virtual {p4, p1}, Le1/j;->i(Le1/i;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v1, v1, v1, p3}, Le1/i;->a(ZIIII)Le1/i;

    move-result-object p1

    invoke-virtual {p4, p1}, Le1/j;->i(Le1/i;)V

    :goto_0
    return-void
.end method

.method public final F(Landroid/os/Parcelable;)V
    .locals 1

    instance-of v0, p1, Lz1/N;

    if-eqz v0, :cond_0

    check-cast p1, Lz1/N;

    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q:Lz1/N;

    invoke-virtual {p0}, Lz1/w;->L()V

    :cond_0
    return-void
.end method

.method public final G()Landroid/os/Parcelable;
    .locals 7

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q:Lz1/N;

    if-eqz v0, :cond_0

    new-instance v1, Lz1/N;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget v2, v0, Lz1/N;->f:I

    iput v2, v1, Lz1/N;->f:I

    iget v2, v0, Lz1/N;->d:I

    iput v2, v1, Lz1/N;->d:I

    iget v2, v0, Lz1/N;->e:I

    iput v2, v1, Lz1/N;->e:I

    iget-object v2, v0, Lz1/N;->g:[I

    iput-object v2, v1, Lz1/N;->g:[I

    iget v2, v0, Lz1/N;->h:I

    iput v2, v1, Lz1/N;->h:I

    iget-object v2, v0, Lz1/N;->i:[I

    iput-object v2, v1, Lz1/N;->i:[I

    iget-boolean v2, v0, Lz1/N;->k:Z

    iput-boolean v2, v1, Lz1/N;->k:Z

    iget-boolean v2, v0, Lz1/N;->l:Z

    iput-boolean v2, v1, Lz1/N;->l:Z

    iget-boolean v2, v0, Lz1/N;->m:Z

    iput-boolean v2, v1, Lz1/N;->m:Z

    iget-object v0, v0, Lz1/N;->j:Ljava/util/ArrayList;

    iput-object v0, v1, Lz1/N;->j:Ljava/util/ArrayList;

    return-object v1

    :cond_0
    new-instance v0, Lz1/N;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->m:Z

    iput-boolean v1, v0, Lz1/N;->k:Z

    const/4 v1, 0x0

    iput-boolean v1, v0, Lz1/N;->l:Z

    iput-boolean v1, v0, Lz1/N;->m:Z

    iput v1, v0, Lz1/N;->h:I

    invoke-virtual {p0}, Lz1/w;->p()I

    move-result v2

    const/4 v3, -0x1

    if-lez v2, :cond_6

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->T()I

    move-result v2

    iput v2, v0, Lz1/N;->d:I

    iget-boolean v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->n:Z

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->R(Z)Landroid/view/View;

    move-result-object v2

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->S(Z)Landroid/view/View;

    move-result-object v2

    :goto_0
    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {v2}, Lz1/w;->x(Landroid/view/View;)I

    move-result v3

    :goto_1
    iput v3, v0, Lz1/N;->e:I

    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    iput v2, v0, Lz1/N;->f:I

    new-array v2, v2, [I

    iput-object v2, v0, Lz1/N;->g:[I

    :goto_2
    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    if-ge v1, v2, :cond_7

    const/high16 v2, -0x80000000

    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->i:[Lz1/O;

    aget-object v3, v3, v1

    iget v4, v3, Lz1/O;->b:I

    const/high16 v5, -0x80000000

    if-eq v4, v5, :cond_3

    goto :goto_3

    :cond_3
    iget-object v4, v3, Lz1/O;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-nez v4, :cond_4

    move v4, v2

    goto :goto_3

    :cond_4
    iget-object v4, v3, Lz1/O;->a:Ljava/util/ArrayList;

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Lz1/L;

    iget-object v6, v3, Lz1/O;->e:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-object v6, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:Lv1/b;

    invoke-virtual {v6, v4}, Lv1/b;->c(Landroid/view/View;)I

    move-result v4

    iput v4, v3, Lz1/O;->b:I

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v4, v3, Lz1/O;->b:I

    :goto_3
    if-eq v4, v2, :cond_5

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:Lv1/b;

    invoke-virtual {v2}, Lv1/b;->e()I

    move-result v2

    sub-int/2addr v4, v2

    :cond_5
    iget-object v2, v0, Lz1/N;->g:[I

    aput v4, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_6
    iput v3, v0, Lz1/N;->d:I

    iput v3, v0, Lz1/N;->e:I

    iput v1, v0, Lz1/N;->f:I

    :cond_7
    return-object v0
.end method

.method public final H(I)V
    .locals 0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->N()Z

    :cond_0
    return-void
.end method

.method public final N()Z
    .locals 7

    invoke-virtual {p0}, Lz1/w;->p()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->p:I

    if-eqz v0, :cond_6

    iget-boolean v0, p0, Lz1/w;->e:Z

    if-nez v0, :cond_0

    goto :goto_3

    :cond_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->n:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->U()I

    move-result v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->T()I

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->T()I

    move-result v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->U()I

    :goto_0
    if-nez v0, :cond_6

    invoke-virtual {p0}, Lz1/w;->p()I

    move-result v0

    add-int/lit8 v2, v0, -0x1

    new-instance v3, Ljava/util/BitSet;

    iget v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    invoke-direct {v3, v4}, Ljava/util/BitSet;-><init>(I)V

    iget v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-virtual {v3, v5, v4, v6}, Ljava/util/BitSet;->set(IIZ)V

    iget v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    const/4 v4, -0x1

    if-ne v3, v6, :cond_3

    invoke-virtual {p0}, Lz1/w;->s()I

    move-result v3

    const/4 v6, 0x1

    if-ne v3, v6, :cond_2

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    :cond_3
    :goto_1
    iget-boolean v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->n:Z

    if-eqz v3, :cond_4

    move v0, v4

    goto :goto_2

    :cond_4
    move v2, v5

    :goto_2
    if-ne v2, v0, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {p0, v2}, Lz1/w;->o(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lz1/L;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    throw v0

    :cond_6
    :goto_3
    return v1
.end method

.method public final O(Lz1/F;)I
    .locals 6

    invoke-virtual {p0}, Lz1/w;->p()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:Lv1/b;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->S(Z)Landroid/view/View;

    move-result-object v2

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->R(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Z

    move-object v0, p1

    move-object v4, p0

    invoke-static/range {v0 .. v5}, Lx/c;->a(Lz1/F;Lv1/b;Landroid/view/View;Landroid/view/View;Lz1/w;Z)I

    move-result p1

    return p1
.end method

.method public final P(Lz1/F;)I
    .locals 7

    invoke-virtual {p0}, Lz1/w;->p()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:Lv1/b;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->S(Z)Landroid/view/View;

    move-result-object v2

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->R(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Z

    iget-boolean v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->n:Z

    move-object v0, p1

    move-object v4, p0

    invoke-static/range {v0 .. v6}, Lx/c;->b(Lz1/F;Lv1/b;Landroid/view/View;Landroid/view/View;Lz1/w;ZZ)I

    move-result p1

    return p1
.end method

.method public final Q(Lz1/F;)I
    .locals 6

    invoke-virtual {p0}, Lz1/w;->p()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:Lv1/b;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->S(Z)Landroid/view/View;

    move-result-object v2

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->R(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->r:Z

    move-object v0, p1

    move-object v4, p0

    invoke-static/range {v0 .. v5}, Lx/c;->c(Lz1/F;Lv1/b;Landroid/view/View;Landroid/view/View;Lz1/w;Z)I

    move-result p1

    return p1
.end method

.method public final R(Z)Landroid/view/View;
    .locals 7

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:Lv1/b;

    invoke-virtual {v0}, Lv1/b;->e()I

    move-result v0

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:Lv1/b;

    invoke-virtual {v1}, Lv1/b;->d()I

    move-result v1

    invoke-virtual {p0}, Lz1/w;->p()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    const/4 v3, 0x0

    :goto_0
    if-ltz v2, :cond_4

    invoke-virtual {p0, v2}, Lz1/w;->o(I)Landroid/view/View;

    move-result-object v4

    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:Lv1/b;

    invoke-virtual {v5, v4}, Lv1/b;->c(Landroid/view/View;)I

    move-result v5

    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:Lv1/b;

    invoke-virtual {v6, v4}, Lv1/b;->b(Landroid/view/View;)I

    move-result v6

    if-le v6, v0, :cond_3

    if-lt v5, v1, :cond_0

    goto :goto_2

    :cond_0
    if-le v6, v1, :cond_2

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    if-nez v3, :cond_3

    move-object v3, v4

    goto :goto_2

    :cond_2
    :goto_1
    return-object v4

    :cond_3
    :goto_2
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_4
    return-object v3
.end method

.method public final S(Z)Landroid/view/View;
    .locals 8

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:Lv1/b;

    invoke-virtual {v0}, Lv1/b;->e()I

    move-result v0

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:Lv1/b;

    invoke-virtual {v1}, Lv1/b;->d()I

    move-result v1

    invoke-virtual {p0}, Lz1/w;->p()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_4

    invoke-virtual {p0, v4}, Lz1/w;->o(I)Landroid/view/View;

    move-result-object v5

    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:Lv1/b;

    invoke-virtual {v6, v5}, Lv1/b;->c(Landroid/view/View;)I

    move-result v6

    iget-object v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->j:Lv1/b;

    invoke-virtual {v7, v5}, Lv1/b;->b(Landroid/view/View;)I

    move-result v7

    if-le v7, v0, :cond_3

    if-lt v6, v1, :cond_0

    goto :goto_2

    :cond_0
    if-ge v6, v0, :cond_2

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    if-nez v3, :cond_3

    move-object v3, v5

    goto :goto_2

    :cond_2
    :goto_1
    return-object v5

    :cond_3
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    return-object v3
.end method

.method public final T()I
    .locals 2

    invoke-virtual {p0}, Lz1/w;->p()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v1}, Lz1/w;->o(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lz1/w;->x(Landroid/view/View;)I

    move-result v1

    :goto_0
    return v1
.end method

.method public final U()I
    .locals 1

    invoke-virtual {p0}, Lz1/w;->p()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Lz1/w;->o(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lz1/w;->x(Landroid/view/View;)I

    move-result v0

    :goto_0
    return v0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->q:Lz1/N;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Lz1/w;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final b()Z
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final c()Z
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final d(Lz1/x;)Z
    .locals 0

    instance-of p1, p1, Lz1/L;

    return p1
.end method

.method public final f(Lz1/F;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->O(Lz1/F;)I

    move-result p1

    return p1
.end method

.method public final g(Lz1/F;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->P(Lz1/F;)I

    move-result p1

    return p1
.end method

.method public final h(Lz1/F;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->Q(Lz1/F;)I

    move-result p1

    return p1
.end method

.method public final i(Lz1/F;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->O(Lz1/F;)I

    move-result p1

    return p1
.end method

.method public final j(Lz1/F;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->P(Lz1/F;)I

    move-result p1

    return p1
.end method

.method public final k(Lz1/F;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->Q(Lz1/F;)I

    move-result p1

    return p1
.end method

.method public final l()Lz1/x;
    .locals 3

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    const/4 v1, -0x1

    const/4 v2, -0x2

    if-nez v0, :cond_0

    new-instance v0, Lz1/L;

    invoke-direct {v0, v2, v1}, Lz1/x;-><init>(II)V

    return-object v0

    :cond_0
    new-instance v0, Lz1/L;

    invoke-direct {v0, v1, v2}, Lz1/x;-><init>(II)V

    return-object v0
.end method

.method public final m(Landroid/content/Context;Landroid/util/AttributeSet;)Lz1/x;
    .locals 1

    new-instance v0, Lz1/L;

    invoke-direct {v0, p1, p2}, Lz1/x;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public final n(Landroid/view/ViewGroup$LayoutParams;)Lz1/x;
    .locals 1

    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_0

    new-instance v0, Lz1/L;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, Lz1/x;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object v0

    :cond_0
    new-instance v0, Lz1/L;

    invoke-direct {v0, p1}, Lz1/x;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public final q(Lz1/C;Lz1/F;)I
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Lz1/w;->q(Lz1/C;Lz1/F;)I

    move-result p1

    return p1
.end method

.method public final z(Lz1/C;Lz1/F;)I
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->l:I

    if-nez v0, :cond_0

    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->h:I

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Lz1/w;->z(Lz1/C;Lz1/F;)I

    move-result p1

    return p1
.end method
