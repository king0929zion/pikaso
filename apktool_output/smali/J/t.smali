.class public final Lj/t;
.super Lj/i;
.source "SourceFile"

# interfaces
.implements Landroid/view/SubMenu;


# instance fields
.field public final v:Lj/i;

.field public final w:Lj/j;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lj/i;Lj/j;)V
    .locals 0

    invoke-direct {p0, p1}, Lj/i;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lj/t;->v:Lj/i;

    iput-object p3, p0, Lj/t;->w:Lj/j;

    return-void
.end method


# virtual methods
.method public final d(Lj/j;)Z
    .locals 1

    iget-object v0, p0, Lj/t;->v:Lj/i;

    invoke-virtual {v0, p1}, Lj/i;->d(Lj/j;)Z

    move-result p1

    return p1
.end method

.method public final e(Lj/i;Landroid/view/MenuItem;)Z
    .locals 1

    invoke-super {p0, p1, p2}, Lj/i;->e(Lj/i;Landroid/view/MenuItem;)Z

    iget-object v0, p0, Lj/t;->v:Lj/i;

    invoke-virtual {v0, p1, p2}, Lj/i;->e(Lj/i;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public final f(Lj/j;)Z
    .locals 1

    iget-object v0, p0, Lj/t;->v:Lj/i;

    invoke-virtual {v0, p1}, Lj/i;->f(Lj/j;)Z

    move-result p1

    return p1
.end method

.method public final getItem()Landroid/view/MenuItem;
    .locals 1

    iget-object v0, p0, Lj/t;->w:Lj/j;

    return-object v0
.end method

.method public final j()Lj/i;
    .locals 1

    iget-object v0, p0, Lj/t;->v:Lj/i;

    invoke-virtual {v0}, Lj/i;->j()Lj/i;

    move-result-object v0

    return-object v0
.end method

.method public final l()Z
    .locals 1

    iget-object v0, p0, Lj/t;->v:Lj/i;

    invoke-virtual {v0}, Lj/i;->l()Z

    move-result v0

    return v0
.end method

.method public final m()Z
    .locals 1

    iget-object v0, p0, Lj/t;->v:Lj/i;

    invoke-virtual {v0}, Lj/i;->m()Z

    move-result v0

    return v0
.end method

.method public final n()Z
    .locals 1

    iget-object v0, p0, Lj/t;->v:Lj/i;

    invoke-virtual {v0}, Lj/i;->n()Z

    move-result v0

    return v0
.end method

.method public final setGroupDividerEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lj/t;->v:Lj/i;

    invoke-virtual {v0, p1}, Lj/i;->setGroupDividerEnabled(Z)V

    return-void
.end method

.method public final setHeaderIcon(I)Landroid/view/SubMenu;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, v0, v1, p1, v1}, Lj/i;->q(ILjava/lang/CharSequence;ILandroid/view/View;)V

    return-object p0
.end method

.method public final setHeaderIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
    .locals 1

    const/4 p1, 0x0

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0, p1, v0}, Lj/i;->q(ILjava/lang/CharSequence;ILandroid/view/View;)V

    return-object p0
.end method

.method public final setHeaderTitle(I)Landroid/view/SubMenu;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, p1, v1, v0, v1}, Lj/i;->q(ILjava/lang/CharSequence;ILandroid/view/View;)V

    return-object p0
.end method

.method public final setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p0, v1, p1, v1, v0}, Lj/i;->q(ILjava/lang/CharSequence;ILandroid/view/View;)V

    return-object p0
.end method

.method public final setHeaderView(Landroid/view/View;)Landroid/view/SubMenu;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1, p1}, Lj/i;->q(ILjava/lang/CharSequence;ILandroid/view/View;)V

    return-object p0
.end method

.method public final setIcon(I)Landroid/view/SubMenu;
    .locals 1

    .line 2
    iget-object v0, p0, Lj/t;->w:Lj/j;

    invoke-virtual {v0, p1}, Lj/j;->setIcon(I)Landroid/view/MenuItem;

    return-object p0
.end method

.method public final setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
    .locals 1

    .line 1
    iget-object v0, p0, Lj/t;->w:Lj/j;

    invoke-virtual {v0, p1}, Lj/j;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public final setQwertyMode(Z)V
    .locals 1

    iget-object v0, p0, Lj/t;->v:Lj/i;

    invoke-virtual {v0, p1}, Lj/i;->setQwertyMode(Z)V

    return-void
.end method
