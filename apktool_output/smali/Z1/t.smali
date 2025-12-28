.class public abstract Lz1/t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lz1/p;

.field public b:Ljava/util/ArrayList;

.field public c:J

.field public d:J

.field public e:J

.field public f:J


# virtual methods
.method public final a(Lz1/I;)V
    .locals 9

    iget-object v0, p0, Lz1/t;->a:Lz1/p;

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lz1/I;->n(Z)V

    iget v2, p1, Lz1/I;->b:I

    and-int/lit8 v2, v2, 0x10

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, v0, Lz1/p;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->C()V

    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->g:LB0/a;

    iget-object v3, v2, LB0/a;->b:Ljava/lang/Object;

    check-cast v3, Lz1/p;

    iget-object v4, v3, Lz1/p;->a:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v4

    const/4 v6, -0x1

    const/4 v7, 0x0

    if-ne v4, v6, :cond_1

    invoke-virtual {v2, v5}, LB0/a;->L(Landroid/view/View;)V

    goto :goto_0

    :cond_1
    iget-object v6, v2, LB0/a;->c:Ljava/lang/Object;

    check-cast v6, Lz1/b;

    invoke-virtual {v6, v4}, Lz1/b;->d(I)Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-virtual {v6, v4}, Lz1/b;->e(I)Z

    invoke-virtual {v2, v5}, LB0/a;->L(Landroid/view/View;)V

    invoke-virtual {v3, v4}, Lz1/p;->a(I)V

    goto :goto_0

    :cond_2
    move v1, v7

    :goto_0
    if-eqz v1, :cond_3

    invoke-static {v5}, Landroidx/recyclerview/widget/RecyclerView;->r(Landroid/view/View;)Lz1/I;

    move-result-object v2

    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->d:Lz1/C;

    invoke-virtual {v3, v2}, Lz1/C;->h(Lz1/I;)V

    invoke-virtual {v3, v2}, Lz1/C;->f(Lz1/I;)V

    :cond_3
    xor-int/lit8 v2, v1, 0x1

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->D(Z)V

    if-nez v1, :cond_4

    invoke-virtual {p1}, Lz1/I;->k()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {v0, v5, v7}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    :cond_4
    :goto_1
    return-void
.end method

.method public abstract b(Lz1/I;)V
.end method

.method public abstract c()V
.end method

.method public abstract d()Z
.end method
