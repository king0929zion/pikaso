.class public final Lj/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:Lj/e;

.field public final synthetic e:Lj/j;

.field public final synthetic f:Lj/i;

.field public final synthetic g:LA/t;


# direct methods
.method public constructor <init>(LA/t;Lj/e;Lj/j;Lj/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/d;->g:LA/t;

    iput-object p2, p0, Lj/d;->d:Lj/e;

    iput-object p3, p0, Lj/d;->e:Lj/j;

    iput-object p4, p0, Lj/d;->f:Lj/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lj/d;->d:Lj/e;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lj/d;->g:LA/t;

    iget-object v2, v1, LA/t;->e:Ljava/lang/Object;

    check-cast v2, Lj/f;

    const/4 v3, 0x1

    iput-boolean v3, v2, Lj/f;->C:Z

    iget-object v0, v0, Lj/e;->b:Lj/i;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lj/i;->c(Z)V

    iget-object v0, v1, LA/t;->e:Ljava/lang/Object;

    check-cast v0, Lj/f;

    iput-boolean v2, v0, Lj/f;->C:Z

    :cond_0
    iget-object v0, p0, Lj/d;->e:Lj/j;

    invoke-virtual {v0}, Lj/j;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lj/j;->hasSubMenu()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lj/d;->f:Lj/i;

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v3, v2}, Lj/i;->p(Landroid/view/MenuItem;Lj/k;I)Z

    :cond_1
    return-void
.end method
