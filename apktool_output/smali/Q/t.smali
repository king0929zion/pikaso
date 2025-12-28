.class public final Lq/t;
.super Li2/j;
.source "SourceFile"

# interfaces
.implements Lo2/e;


# instance fields
.field public h:I

.field public final synthetic i:Lq/u;


# direct methods
.method public constructor <init>(Lq/u;Lg2/d;)V
    .locals 0

    iput-object p1, p0, Lq/t;->i:Lq/u;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Li2/j;-><init>(ILg2/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lg2/d;Ljava/lang/Object;)Lg2/d;
    .locals 1

    new-instance p2, Lq/t;

    iget-object v0, p0, Lq/t;->i:Lq/u;

    invoke-direct {p2, v0, p1}, Lq/t;-><init>(Lq/u;Lg2/d;)V

    return-object p2
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly2/u;

    check-cast p2, Lg2/d;

    invoke-virtual {p0, p2, p1}, Lq/t;->f(Lg2/d;Ljava/lang/Object;)Lg2/d;

    move-result-object p1

    check-cast p1, Lq/t;

    sget-object p2, Lc2/m;->a:Lc2/m;

    invoke-virtual {p1, p2}, Lq/t;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lh2/a;->d:Lh2/a;

    iget v1, p0, Lq/t;->h:I

    sget-object v2, Lc2/m;->a:Lc2/m;

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LZ0/d;->U(Ljava/lang/Object;)V

    iput v3, p0, Lq/t;->h:I

    iget-object p1, p0, Lq/t;->i:Lq/u;

    iget-object v1, p1, LP/k;->d:LP/k;

    iget-boolean v1, v1, LP/k;->p:Z

    if-nez v1, :cond_2

    goto/16 :goto_3

    :cond_2
    const/4 v3, 0x0

    if-eqz v1, :cond_d

    const/4 v1, 0x2

    invoke-static {p1, v1}, Ln0/C;->p(Ln0/h;I)Ln0/Y;

    move-result-object v1

    invoke-virtual {v1}, Ln0/Y;->q0()LP/k;

    move-result-object v4

    iget-boolean v4, v4, LP/k;->p:Z

    if-eqz v4, :cond_c

    iget-object v4, p1, LP/k;->d:LP/k;

    iget-boolean v4, v4, LP/k;->p:Z

    if-nez v4, :cond_3

    move-object v4, v3

    goto :goto_0

    :cond_3
    sget-object v4, Lu/b;->q:Ls1/c;

    invoke-static {p1, v4}, Ln0/C;->i(Ln0/h;Ljava/lang/Object;)Ln0/o0;

    move-result-object v4

    check-cast v4, Lu/a;

    if-nez v4, :cond_4

    new-instance v4, Lu/c;

    invoke-direct {v4, p1}, Lu/c;-><init>(Ln0/h;)V

    :cond_4
    :goto_0
    if-nez v4, :cond_5

    goto :goto_3

    :cond_5
    check-cast v4, Lu/c;

    iget-object p1, v4, Lu/c;->d:Ln0/h;

    move-object v4, p1

    check-cast v4, LP/k;

    iget-object v4, v4, LP/k;->d:LP/k;

    iget-boolean v4, v4, LP/k;->p:Z

    if-eqz v4, :cond_b

    invoke-static {p1}, Ln0/C;->q(Ln0/h;)Ln0/z;

    move-result-object p1

    invoke-static {p1}, Ln0/C;->s(Ln0/z;)Ln0/e0;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    const-wide/16 v4, 0x0

    invoke-virtual {v1, v4, v5}, Ln0/Y;->z0(J)J

    move-result-wide v6

    invoke-virtual {v1}, Ln0/Y;->q0()LP/k;

    move-result-object v8

    iget-boolean v8, v8, LP/k;->p:Z

    if-eqz v8, :cond_6

    goto :goto_1

    :cond_6
    move-object v1, v3

    :goto_1
    if-eqz v1, :cond_7

    iget-wide v8, v1, Ll0/o;->f:J

    invoke-static {v8, v9}, Lr2/a;->c0(J)J

    move-result-wide v8

    invoke-static {v4, v5, v8, v9}, La/a;->c(JJ)LV/d;

    move-result-object v1

    goto :goto_2

    :cond_7
    move-object v1, v3

    :goto_2
    if-eqz v1, :cond_8

    invoke-virtual {v1, v6, v7}, LV/d;->e(J)LV/d;

    move-result-object v3

    :cond_8
    if-eqz v3, :cond_9

    new-instance v1, Landroid/graphics/Rect;

    iget v4, v3, LV/d;->a:F

    float-to-int v4, v4

    iget v5, v3, LV/d;->b:F

    float-to-int v5, v5

    iget v6, v3, LV/d;->c:F

    float-to-int v6, v6

    iget v3, v3, LV/d;->d:F

    float-to-int v3, v3

    invoke-direct {v1, v4, v5, v6, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    const/4 v3, 0x0

    invoke-virtual {p1, v1, v3}, Landroid/view/View;->requestRectangleOnScreen(Landroid/graphics/Rect;Z)Z

    :cond_9
    :goto_3
    if-ne v2, v0, :cond_a

    return-object v0

    :cond_a
    :goto_4
    return-object v2

    :cond_b
    const-string p1, "Cannot get View because the Modifier node is not currently attached."

    invoke-static {p1}, LZ0/d;->S(Ljava/lang/String;)V

    throw v3

    :cond_c
    const-string p1, "LayoutCoordinates is not attached."

    invoke-static {p1}, LZ0/d;->S(Ljava/lang/String;)V

    throw v3

    :cond_d
    const-string p1, "Cannot get LayoutCoordinates, Modifier.Node is not attached."

    invoke-static {p1}, LZ0/d;->S(Ljava/lang/String;)V

    throw v3
.end method
