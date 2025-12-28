.class public final synthetic LY1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le1/s;


# instance fields
.field public final synthetic d:Lcom/google/android/material/sidesheet/SideSheetBehavior;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/sidesheet/SideSheetBehavior;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY1/b;->d:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    iput p2, p0, LY1/b;->e:I

    return-void
.end method


# virtual methods
.method public final f(Landroid/view/View;)Z
    .locals 4

    const/4 p1, 0x1

    iget-object v0, p0, LY1/b;->d:Lcom/google/android/material/sidesheet/SideSheetBehavior;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, p0, LY1/b;->e:I

    if-eq v1, p1, :cond_4

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    goto :goto_2

    :cond_0
    iget-object v2, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    new-instance v3, LU0/n;

    invoke-direct {v3, v1, p1, v0}, LU0/n;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Landroid/view/ViewParent;->isLayoutRequested()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Ld1/K;->a:Ljava/lang/reflect/Field;

    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v2, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    :cond_2
    invoke-virtual {v3}, LU0/n;->run()V

    goto :goto_1

    :cond_3
    :goto_0
    invoke-virtual {v0, v1}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->r(I)V

    :goto_1
    return p1

    :cond_4
    :goto_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "STATE_"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-ne v1, p1, :cond_5

    const-string p1, "DRAGGING"

    goto :goto_3

    :cond_5
    const-string p1, "SETTLING"

    :goto_3
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " should not be set externally."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
