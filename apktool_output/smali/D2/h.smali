.class public final LD2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic d:I

.field public e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 1
    iput p1, p0, LD2/h;->d:I

    iput-object p2, p0, LD2/h;->e:Ljava/lang/Object;

    iput-object p3, p0, LD2/h;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/behavior/SwipeDismissBehavior;Landroid/view/View;Z)V
    .locals 0

    const/4 p3, 0x1

    iput p3, p0, LD2/h;->d:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD2/h;->f:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, LD2/h;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 2
    iput p2, p0, LD2/h;->d:I

    iput-object p1, p0, LD2/h;->f:Ljava/lang/Object;

    iput-object p3, p0, LD2/h;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, LD2/h;->f:Ljava/lang/Object;

    iget v2, p0, LD2/h;->d:I

    packed-switch v2, :pswitch_data_0

    iget-object v0, p0, LD2/h;->e:Ljava/lang/Object;

    check-cast v0, Ly2/f;

    check-cast v1, Lz2/c;

    invoke-virtual {v0, v1}, Ly2/f;->E(Ly2/r;)V

    return-void

    :pswitch_0
    check-cast v1, Lk/h;

    iget-object v2, v1, Lk/h;->f:Lj/i;

    if-eqz v2, :cond_2

    iget-object v2, v2, Lj/i;->e:LA/t;

    if-eqz v2, :cond_2

    iget-object v2, v2, LA/t;->e:Ljava/lang/Object;

    check-cast v2, Landroidx/appcompat/widget/ActionMenuView;

    iget-object v2, v2, Landroidx/appcompat/widget/ActionMenuView;->w:Lk/N0;

    if-eqz v2, :cond_2

    iget-object v2, v2, Lk/N0;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v3, v2, Landroidx/appcompat/widget/Toolbar;->d:Landroidx/appcompat/widget/ActionMenuView;

    iget-object v3, v3, Landroidx/appcompat/widget/ActionMenuView;->v:Lk/h;

    if-eqz v3, :cond_0

    iget-object v3, v3, Lk/h;->u:Lk/e;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lj/n;->b()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, v2, Landroidx/appcompat/widget/Toolbar;->J:LA/t;

    iget-object v2, v2, LA/t;->e:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/ClassCastException;

    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    throw v0

    :cond_2
    :goto_0
    iget-object v2, v1, Lk/h;->j:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    if-eqz v2, :cond_5

    iget-object v2, p0, LD2/h;->e:Ljava/lang/Object;

    check-cast v2, Lk/e;

    invoke-virtual {v2}, Lj/n;->b()Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_1

    :cond_3
    iget-object v3, v2, Lj/n;->e:Landroid/view/View;

    if-nez v3, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v2, v0, v0, v0, v0}, Lj/n;->d(IIZZ)V

    :goto_1
    iput-object v2, v1, Lk/h;->u:Lk/e;

    :cond_5
    :goto_2
    const/4 v0, 0x0

    iput-object v0, v1, Lk/h;->w:LD2/h;

    return-void

    :pswitch_1
    iget-object v0, p0, LD2/h;->e:Ljava/lang/Object;

    check-cast v0, La1/e;

    invoke-virtual {v0, v1}, La1/e;->a(Ljava/lang/Object;)V

    return-void

    :pswitch_2
    iget-object v0, p0, LD2/h;->e:Ljava/lang/Object;

    check-cast v0, LA/t;

    iget-object v0, v0, LA/t;->e:Ljava/lang/Object;

    check-cast v0, LU0/b;

    if-eqz v0, :cond_6

    check-cast v1, Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, LU0/b;->h(Landroid/graphics/Typeface;)V

    :cond_6
    return-void

    :pswitch_3
    check-cast v1, Lcom/google/android/material/behavior/SwipeDismissBehavior;

    iget-object v0, v1, Lcom/google/android/material/behavior/SwipeDismissBehavior;->a:Ln1/e;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ln1/e;->f()Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object v0, Ld1/K;->a:Ljava/lang/reflect/Field;

    iget-object v0, p0, LD2/h;->e:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    :cond_7
    return-void

    :cond_8
    :pswitch_4
    :try_start_0
    iget-object v2, p0, LD2/h;->e:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Runnable;

    invoke-interface {v2}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v2

    sget-object v3, Lg2/j;->d:Lg2/j;

    invoke-static {v3, v2}, Ly2/v;->h(Lg2/i;Ljava/lang/Throwable;)V

    :goto_3
    move-object v2, v1

    check-cast v2, LD2/i;

    invoke-virtual {v2}, LD2/i;->j()Ljava/lang/Runnable;

    move-result-object v3

    if-nez v3, :cond_9

    goto :goto_4

    :cond_9
    iput-object v3, p0, LD2/h;->e:Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    const/16 v3, 0x10

    if-lt v0, v3, :cond_8

    iget-object v0, v2, LD2/i;->f:LF2/l;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v2, p0}, LF2/l;->d(Lg2/i;Ljava/lang/Runnable;)V

    :goto_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
