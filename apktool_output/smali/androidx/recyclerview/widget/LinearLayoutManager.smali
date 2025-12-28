.class public Landroidx/recyclerview/widget/LinearLayoutManager;
.super Lz1/w;
.source "SourceFile"


# instance fields
.field public h:I

.field public i:Ls1/c;

.field public j:Lv1/b;

.field public final k:Z

.field public final l:Z

.field public m:Z

.field public final n:Z

.field public o:Lz1/n;

.field public final p:Lz1/m;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lz1/w;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->h:I

    const/4 v1, 0x0

    .line 3
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->k:Z

    .line 4
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->l:Z

    .line 5
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:Z

    .line 6
    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->n:Z

    const/4 v2, 0x0

    .line 7
    iput-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->o:Lz1/n;

    .line 8
    new-instance v3, Lz1/m;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lz1/m;-><init>(I)V

    iput-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:Lz1/m;

    .line 9
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->U(I)V

    .line 10
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->a(Ljava/lang/String;)V

    .line 11
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->k:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 12
    :cond_0
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->k:Z

    .line 13
    invoke-virtual {p0}, Lz1/w;->L()V

    :goto_0
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 3

    .line 14
    invoke-direct {p0}, Lz1/w;-><init>()V

    const/4 v0, 0x1

    .line 15
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->h:I

    const/4 v1, 0x0

    .line 16
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->k:Z

    .line 17
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->l:Z

    .line 18
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:Z

    .line 19
    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->n:Z

    const/4 v0, 0x0

    .line 20
    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->o:Lz1/n;

    .line 21
    new-instance v1, Lz1/m;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lz1/m;-><init>(I)V

    iput-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:Lz1/m;

    .line 22
    invoke-static {p1, p2, p3, p4}, Lz1/w;->y(Landroid/content/Context;Landroid/util/AttributeSet;II)Lz1/m;

    move-result-object p1

    .line 23
    iget p2, p1, Lz1/m;->b:I

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->U(I)V

    .line 24
    iget-boolean p2, p1, Lz1/m;->d:Z

    .line 25
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->a(Ljava/lang/String;)V

    .line 26
    iget-boolean p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->k:Z

    if-ne p2, p3, :cond_0

    goto :goto_0

    .line 27
    :cond_0
    iput-boolean p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->k:Z

    .line 28
    invoke-virtual {p0}, Lz1/w;->L()V

    .line 29
    :goto_0
    iget-boolean p1, p1, Lz1/m;->e:Z

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->V(Z)V

    return-void
.end method


# virtual methods
.method public final A()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final B(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    return-void
.end method

.method public final C(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 3

    invoke-super {p0, p1}, Lz1/w;->C(Landroid/view/accessibility/AccessibilityEvent;)V

    invoke-virtual {p0}, Lz1/w;->p()I

    move-result v0

    if-lez v0, :cond_2

    invoke-virtual {p0}, Lz1/w;->p()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->T(IIZ)Landroid/view/View;

    move-result-object v0

    const/4 v2, -0x1

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lz1/w;->x(Landroid/view/View;)I

    move-result v0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    invoke-virtual {p0}, Lz1/w;->p()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0, v2, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->T(IIZ)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v0}, Lz1/w;->x(Landroid/view/View;)I

    move-result v2

    :goto_1
    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    :cond_2
    return-void
.end method

.method public final F(Landroid/os/Parcelable;)V
    .locals 1

    instance-of v0, p1, Lz1/n;

    if-eqz v0, :cond_0

    check-cast p1, Lz1/n;

    iput-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->o:Lz1/n;

    invoke-virtual {p0}, Lz1/w;->L()V

    :cond_0
    return-void
.end method

.method public final G()Landroid/os/Parcelable;
    .locals 4

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->o:Lz1/n;

    if-eqz v0, :cond_0

    new-instance v1, Lz1/n;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget v2, v0, Lz1/n;->d:I

    iput v2, v1, Lz1/n;->d:I

    iget v2, v0, Lz1/n;->e:I

    iput v2, v1, Lz1/n;->e:I

    iget-boolean v0, v0, Lz1/n;->f:Z

    iput-boolean v0, v1, Lz1/n;->f:Z

    return-object v1

    :cond_0
    new-instance v0, Lz1/n;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Lz1/w;->p()I

    move-result v1

    if-lez v1, :cond_4

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->Q()V

    const/4 v1, 0x0

    iget-boolean v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->l:Z

    xor-int/2addr v1, v2

    iput-boolean v1, v0, Lz1/n;->f:Z

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->l:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lz1/w;->p()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    invoke-virtual {p0, v1}, Lz1/w;->o(I)Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->j:Lv1/b;

    invoke-virtual {v2}, Lv1/b;->d()I

    move-result v2

    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->j:Lv1/b;

    invoke-virtual {v3, v1}, Lv1/b;->b(Landroid/view/View;)I

    move-result v3

    sub-int/2addr v2, v3

    iput v2, v0, Lz1/n;->e:I

    invoke-static {v1}, Lz1/w;->x(Landroid/view/View;)I

    move-result v1

    iput v1, v0, Lz1/n;->d:I

    goto :goto_2

    :cond_2
    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->l:Z

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lz1/w;->p()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {p0, v1}, Lz1/w;->o(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Lz1/w;->x(Landroid/view/View;)I

    move-result v2

    iput v2, v0, Lz1/n;->d:I

    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->j:Lv1/b;

    invoke-virtual {v2, v1}, Lv1/b;->c(Landroid/view/View;)I

    move-result v1

    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->j:Lv1/b;

    invoke-virtual {v2}, Lv1/b;->e()I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, v0, Lz1/n;->e:I

    goto :goto_2

    :cond_4
    const/4 v1, -0x1

    iput v1, v0, Lz1/n;->d:I

    :goto_2
    return-object v0
.end method

.method public final N(Lz1/F;)I
    .locals 6

    invoke-virtual {p0}, Lz1/w;->p()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->Q()V

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->j:Lv1/b;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->n:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->S(Z)Landroid/view/View;

    move-result-object v2

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->R(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->n:Z

    move-object v0, p1

    move-object v4, p0

    invoke-static/range {v0 .. v5}, Lx/c;->a(Lz1/F;Lv1/b;Landroid/view/View;Landroid/view/View;Lz1/w;Z)I

    move-result p1

    return p1
.end method

.method public final O(Lz1/F;)I
    .locals 7

    invoke-virtual {p0}, Lz1/w;->p()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->Q()V

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->j:Lv1/b;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->n:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->S(Z)Landroid/view/View;

    move-result-object v2

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->R(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->n:Z

    iget-boolean v6, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->l:Z

    move-object v0, p1

    move-object v4, p0

    invoke-static/range {v0 .. v6}, Lx/c;->b(Lz1/F;Lv1/b;Landroid/view/View;Landroid/view/View;Lz1/w;ZZ)I

    move-result p1

    return p1
.end method

.method public final P(Lz1/F;)I
    .locals 6

    invoke-virtual {p0}, Lz1/w;->p()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->Q()V

    iget-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->j:Lv1/b;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->n:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->S(Z)Landroid/view/View;

    move-result-object v2

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->R(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->n:Z

    move-object v0, p1

    move-object v4, p0

    invoke-static/range {v0 .. v5}, Lx/c;->c(Lz1/F;Lv1/b;Landroid/view/View;Landroid/view/View;Lz1/w;Z)I

    move-result p1

    return p1
.end method

.method public final Q()V
    .locals 3

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->i:Ls1/c;

    if-nez v0, :cond_0

    new-instance v0, Ls1/c;

    const/16 v1, 0x10

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ls1/c;-><init>(IZ)V

    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->i:Ls1/c;

    :cond_0
    return-void
.end method

.method public final R(Z)Landroid/view/View;
    .locals 2

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->l:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0}, Lz1/w;->p()I

    move-result v1

    invoke-virtual {p0, v0, v1, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->T(IIZ)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lz1/w;->p()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->T(IIZ)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final S(Z)Landroid/view/View;
    .locals 2

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->l:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lz1/w;->p()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->T(IIZ)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0}, Lz1/w;->p()I

    move-result v1

    invoke-virtual {p0, v0, v1, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->T(IIZ)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final T(IIZ)Landroid/view/View;
    .locals 2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->Q()V

    const/16 v0, 0x140

    if-eqz p3, :cond_0

    const/16 p3, 0x6003

    goto :goto_0

    :cond_0
    move p3, v0

    :goto_0
    iget v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->h:I

    if-nez v1, :cond_1

    iget-object v1, p0, Lz1/w;->c:LB2/i;

    invoke-virtual {v1, p1, p2, p3, v0}, LB2/i;->j(IIII)Landroid/view/View;

    move-result-object p1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lz1/w;->d:LB2/i;

    invoke-virtual {v1, p1, p2, p3, v0}, LB2/i;->j(IIII)Landroid/view/View;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public final U(I)V
    .locals 2

    if-eqz p1, :cond_1

    const/4 v0, 0x1

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
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->a(Ljava/lang/String;)V

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->h:I

    if-ne p1, v0, :cond_2

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->j:Lv1/b;

    if-nez v0, :cond_3

    :cond_2
    invoke-static {p0, p1}, Lv1/b;->a(Lz1/w;I)Lv1/b;

    move-result-object v0

    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->j:Lv1/b;

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->p:Lz1/m;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->h:I

    invoke-virtual {p0}, Lz1/w;->L()V

    :cond_3
    return-void
.end method

.method public V(Z)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->a(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->m:Z

    invoke-virtual {p0}, Lz1/w;->L()V

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->o:Lz1/n;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Lz1/w;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final b()Z
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->h:I

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

    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->h:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final f(Lz1/F;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->N(Lz1/F;)I

    move-result p1

    return p1
.end method

.method public g(Lz1/F;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->O(Lz1/F;)I

    move-result p1

    return p1
.end method

.method public h(Lz1/F;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->P(Lz1/F;)I

    move-result p1

    return p1
.end method

.method public final i(Lz1/F;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->N(Lz1/F;)I

    move-result p1

    return p1
.end method

.method public j(Lz1/F;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->O(Lz1/F;)I

    move-result p1

    return p1
.end method

.method public k(Lz1/F;)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->P(Lz1/F;)I

    move-result p1

    return p1
.end method

.method public l()Lz1/x;
    .locals 2

    new-instance v0, Lz1/x;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Lz1/x;-><init>(II)V

    return-object v0
.end method
