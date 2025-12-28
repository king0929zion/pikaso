.class public Ld1/h0;
.super Ld1/g0;
.source "SourceFile"


# instance fields
.field public n:LV0/c;

.field public o:LV0/c;

.field public p:LV0/c;


# direct methods
.method public constructor <init>(Ld1/l0;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ld1/g0;-><init>(Ld1/l0;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    iput-object p1, p0, Ld1/h0;->n:LV0/c;

    iput-object p1, p0, Ld1/h0;->o:LV0/c;

    iput-object p1, p0, Ld1/h0;->p:LV0/c;

    return-void
.end method


# virtual methods
.method public g()LV0/c;
    .locals 1

    iget-object v0, p0, Ld1/h0;->o:LV0/c;

    if-nez v0, :cond_0

    iget-object v0, p0, Ld1/e0;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, Ld1/a0;->t(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, LV0/c;->c(Landroid/graphics/Insets;)LV0/c;

    move-result-object v0

    iput-object v0, p0, Ld1/h0;->o:LV0/c;

    :cond_0
    iget-object v0, p0, Ld1/h0;->o:LV0/c;

    return-object v0
.end method

.method public i()LV0/c;
    .locals 1

    iget-object v0, p0, Ld1/h0;->n:LV0/c;

    if-nez v0, :cond_0

    iget-object v0, p0, Ld1/e0;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, Ld1/a0;->y(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, LV0/c;->c(Landroid/graphics/Insets;)LV0/c;

    move-result-object v0

    iput-object v0, p0, Ld1/h0;->n:LV0/c;

    :cond_0
    iget-object v0, p0, Ld1/h0;->n:LV0/c;

    return-object v0
.end method

.method public k()LV0/c;
    .locals 1

    iget-object v0, p0, Ld1/h0;->p:LV0/c;

    if-nez v0, :cond_0

    iget-object v0, p0, Ld1/e0;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, Ld1/a0;->d(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, LV0/c;->c(Landroid/graphics/Insets;)LV0/c;

    move-result-object v0

    iput-object v0, p0, Ld1/h0;->p:LV0/c;

    :cond_0
    iget-object v0, p0, Ld1/h0;->p:LV0/c;

    return-object v0
.end method

.method public l(IIII)Ld1/l0;
    .locals 1

    iget-object v0, p0, Ld1/e0;->c:Landroid/view/WindowInsets;

    invoke-static {v0, p1, p2, p3, p4}, Ld1/a0;->i(Landroid/view/WindowInsets;IIII)Landroid/view/WindowInsets;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p2, p1}, Ld1/l0;->d(Landroid/view/View;Landroid/view/WindowInsets;)Ld1/l0;

    move-result-object p1

    return-object p1
.end method

.method public q(LV0/c;)V
    .locals 0

    return-void
.end method
