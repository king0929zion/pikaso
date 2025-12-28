.class public Ld1/b0;
.super Ld1/d0;
.source "SourceFile"


# instance fields
.field public final c:Landroid/view/WindowInsets$Builder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ld1/d0;-><init>()V

    .line 2
    invoke-static {}, Ld1/a0;->g()Landroid/view/WindowInsets$Builder;

    move-result-object v0

    iput-object v0, p0, Ld1/b0;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public constructor <init>(Ld1/l0;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Ld1/d0;-><init>(Ld1/l0;)V

    .line 4
    invoke-virtual {p1}, Ld1/l0;->c()Landroid/view/WindowInsets;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 5
    invoke-static {p1}, Ld1/a0;->h(Landroid/view/WindowInsets;)Landroid/view/WindowInsets$Builder;

    move-result-object p1

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, Ld1/a0;->g()Landroid/view/WindowInsets$Builder;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Ld1/b0;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method


# virtual methods
.method public b()Ld1/l0;
    .locals 3

    invoke-virtual {p0}, Ld1/d0;->a()V

    iget-object v0, p0, Ld1/b0;->c:Landroid/view/WindowInsets$Builder;

    invoke-static {v0}, LZ/h;->d(Landroid/view/WindowInsets$Builder;)Landroid/view/WindowInsets;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ld1/l0;->d(Landroid/view/View;Landroid/view/WindowInsets;)Ld1/l0;

    move-result-object v0

    iget-object v1, p0, Ld1/d0;->b:[LV0/c;

    iget-object v2, v0, Ld1/l0;->a:Ld1/j0;

    invoke-virtual {v2, v1}, Ld1/j0;->o([LV0/c;)V

    return-object v0
.end method

.method public d(LV0/c;)V
    .locals 1

    iget-object v0, p0, Ld1/b0;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, LV0/c;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, LZ/h;->u(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method

.method public e(LV0/c;)V
    .locals 1

    iget-object v0, p0, Ld1/b0;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, LV0/c;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, LZ/h;->o(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method

.method public f(LV0/c;)V
    .locals 1

    iget-object v0, p0, Ld1/b0;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, LV0/c;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, LZ/h;->r(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method

.method public g(LV0/c;)V
    .locals 1

    iget-object v0, p0, Ld1/b0;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, LV0/c;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, LZ/h;->l(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method

.method public h(LV0/c;)V
    .locals 1

    iget-object v0, p0, Ld1/b0;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, LV0/c;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, Ld1/a0;->n(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method
