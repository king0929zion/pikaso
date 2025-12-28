.class public abstract Lb/k;
.super Landroid/app/Activity;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/J;
.implements Landroidx/lifecycle/i;
.implements LA1/g;
.implements Landroidx/lifecycle/r;


# instance fields
.field public final d:Landroidx/lifecycle/t;

.field public final e:Ld/a;

.field public final f:LA/t;

.field public final g:Landroidx/lifecycle/t;

.field public final h:LA1/f;

.field public i:Landroidx/lifecycle/I;

.field public j:Lb/r;

.field public final k:Lb/j;

.field public final l:LA1/f;

.field public final m:Lb/f;

.field public final n:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final o:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final p:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final q:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final r:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public s:Z

.field public t:Z


# direct methods
.method public constructor <init>()V
    .locals 7

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    new-instance v0, Landroidx/lifecycle/t;

    invoke-direct {v0, p0}, Landroidx/lifecycle/t;-><init>(Landroidx/lifecycle/r;)V

    iput-object v0, p0, Lb/k;->d:Landroidx/lifecycle/t;

    new-instance v0, Ld/a;

    invoke-direct {v0}, Ld/a;-><init>()V

    iput-object v0, p0, Lb/k;->e:Ld/a;

    new-instance v0, LA/t;

    new-instance v1, LR/a;

    move-object v2, p0

    check-cast v2, Lcom/ai/assistance/operit/provider/MainComposeActivity;

    const/4 v3, 0x6

    invoke-direct {v1, v3, v2}, LR/a;-><init>(ILjava/lang/Object;)V

    invoke-direct {v0, v1}, LA/t;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, Lb/k;->f:LA/t;

    new-instance v0, Landroidx/lifecycle/t;

    invoke-direct {v0, p0}, Landroidx/lifecycle/t;-><init>(Landroidx/lifecycle/r;)V

    iput-object v0, p0, Lb/k;->g:Landroidx/lifecycle/t;

    new-instance v1, LA1/f;

    invoke-direct {v1, p0}, LA1/f;-><init>(LA1/g;)V

    iput-object v1, p0, Lb/k;->h:LA1/f;

    const/4 v3, 0x0

    iput-object v3, p0, Lb/k;->j:Lb/r;

    new-instance v4, Lb/j;

    invoke-direct {v4, v2}, Lb/j;-><init>(Lcom/ai/assistance/operit/provider/MainComposeActivity;)V

    iput-object v4, p0, Lb/k;->k:Lb/j;

    new-instance v5, LA1/f;

    new-instance v6, Lb/c;

    invoke-direct {v6, v2}, Lb/c;-><init>(Lcom/ai/assistance/operit/provider/MainComposeActivity;)V

    invoke-direct {v5, v4, v6}, LA1/f;-><init>(Lb/j;Lb/c;)V

    iput-object v5, p0, Lb/k;->l:LA1/f;

    new-instance v4, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v4}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    new-instance v4, Lb/f;

    invoke-direct {v4}, Lb/f;-><init>()V

    iput-object v4, p0, Lb/k;->m:Lb/f;

    new-instance v4, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v4, p0, Lb/k;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v4, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v4, p0, Lb/k;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v4, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v4, p0, Lb/k;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v4, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v4, p0, Lb/k;->q:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v4, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v4, p0, Lb/k;->r:Ljava/util/concurrent/CopyOnWriteArrayList;

    const/4 v4, 0x0

    iput-boolean v4, p0, Lb/k;->s:Z

    iput-boolean v4, p0, Lb/k;->t:Z

    new-instance v4, Lb/g;

    const/4 v5, 0x0

    invoke-direct {v4, v2, v5}, Lb/g;-><init>(Lcom/ai/assistance/operit/provider/MainComposeActivity;I)V

    invoke-virtual {v0, v4}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/q;)V

    new-instance v4, Lb/g;

    const/4 v5, 0x1

    invoke-direct {v4, v2, v5}, Lb/g;-><init>(Lcom/ai/assistance/operit/provider/MainComposeActivity;I)V

    invoke-virtual {v0, v4}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/q;)V

    new-instance v4, Lb/g;

    const/4 v5, 0x2

    invoke-direct {v4, v2, v5}, Lb/g;-><init>(Lcom/ai/assistance/operit/provider/MainComposeActivity;I)V

    invoke-virtual {v0, v4}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/q;)V

    invoke-virtual {v1}, LA1/f;->c()V

    iget-object v0, v0, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    sget-object v4, Landroidx/lifecycle/m;->e:Landroidx/lifecycle/m;

    if-eq v0, v4, :cond_1

    sget-object v4, Landroidx/lifecycle/m;->f:Landroidx/lifecycle/m;

    if-ne v0, v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Failed requirement."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, v1, LA1/f;->c:Ljava/lang/Object;

    check-cast v0, LA1/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, LA1/e;->c:Ljava/lang/Object;

    check-cast v0, Lm/f;

    invoke-virtual {v0}, Lm/f;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    move-object v1, v0

    check-cast v1, Lm/b;

    invoke-virtual {v1}, Lm/b;->hasNext()Z

    move-result v4

    const-string v5, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    if-eqz v4, :cond_3

    invoke-virtual {v1}, Lm/b;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    const-string v4, "components"

    invoke-static {v1, v4}, Lp2/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LA1/d;

    invoke-static {v4, v5}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    move-object v3, v1

    :cond_3
    if-nez v3, :cond_4

    new-instance v0, Landroidx/lifecycle/F;

    iget-object v1, p0, Lb/k;->h:LA1/f;

    iget-object v1, v1, LA1/f;->c:Ljava/lang/Object;

    check-cast v1, LA1/e;

    invoke-direct {v0, v1, p0}, Landroidx/lifecycle/F;-><init>(LA1/e;Lb/k;)V

    iget-object v1, p0, Lb/k;->h:LA1/f;

    iget-object v1, v1, LA1/f;->c:Ljava/lang/Object;

    check-cast v1, LA1/e;

    invoke-virtual {v1, v5, v0}, LA1/e;->b(Ljava/lang/String;LA1/d;)V

    iget-object v1, p0, Lb/k;->g:Landroidx/lifecycle/t;

    new-instance v3, LA1/a;

    const/4 v4, 0x2

    invoke-direct {v3, v4, v0}, LA1/a;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v3}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/q;)V

    :cond_4
    iget-object v0, p0, Lb/k;->h:LA1/f;

    iget-object v0, v0, LA1/f;->c:Ljava/lang/Object;

    check-cast v0, LA1/e;

    new-instance v1, Lb/d;

    const/4 v3, 0x0

    invoke-direct {v1, v3, v2}, Lb/d;-><init>(ILjava/lang/Object;)V

    const-string v3, "android:support:activity-result"

    invoke-virtual {v0, v3, v1}, LA1/e;->b(Ljava/lang/String;LA1/d;)V

    new-instance v0, Lb/e;

    invoke-direct {v0, v2}, Lb/e;-><init>(Lcom/ai/assistance/operit/provider/MainComposeActivity;)V

    iget-object v1, p0, Lb/k;->e:Ld/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v1, Ld/a;->b:Lb/k;

    if-eqz v2, :cond_5

    invoke-virtual {v0}, Lb/e;->a()V

    :cond_5
    iget-object v1, v1, Ld/a;->a:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic d(Lb/k;)V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V

    return-void
.end method


# virtual methods
.method public final a()Lv1/b;
    .locals 4

    new-instance v0, Lv1/c;

    sget-object v1, Lv1/a;->b:Lv1/a;

    invoke-direct {v0, v1}, Lv1/c;-><init>(Lv1/b;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    iget-object v2, v0, Lv1/b;->a:Ljava/lang/Object;

    check-cast v2, Ljava/util/LinkedHashMap;

    if-eqz v1, :cond_0

    sget-object v1, Landroidx/lifecycle/E;->g:LX1/e;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v3

    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object v1, Landroidx/lifecycle/E;->d:LX1/e;

    invoke-interface {v2, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Landroidx/lifecycle/E;->e:LX1/e;

    invoke-interface {v2, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_1

    sget-object v1, Landroidx/lifecycle/E;->f:LX1/e;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public final addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    invoke-virtual {p0}, Lb/k;->f()V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lb/k;->k:Lb/j;

    invoke-virtual {v1, v0}, Lb/j;->a(Landroid/view/View;)V

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final b()LA1/e;
    .locals 1

    iget-object v0, p0, Lb/k;->h:LA1/f;

    iget-object v0, v0, LA1/f;->c:Ljava/lang/Object;

    check-cast v0, LA1/e;

    return-object v0
.end method

.method public final c()Landroidx/lifecycle/t;
    .locals 1

    iget-object v0, p0, Lb/k;->g:Landroidx/lifecycle/t;

    return-object v0
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 11

    const-string v0, "event"

    invoke-static {p1, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const-string v1, "window.decorView"

    invoke-static {v0, v1}, Lp2/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, LZ0/d;->r(Landroid/view/View;Landroid/view/KeyEvent;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    goto/16 :goto_8

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-lt v0, v2, :cond_1

    invoke-super {p0, p1}, Landroid/app/Activity;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    move v1, p1

    goto/16 :goto_8

    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->onUserInteraction()V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroid/view/Window;->hasFeature(I)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_5

    invoke-virtual {p0}, Landroid/app/Activity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v3

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v5

    const/16 v6, 0x52

    if-ne v5, v6, :cond_5

    if-eqz v3, :cond_5

    sget-boolean v5, LZ0/d;->a:Z

    if-nez v5, :cond_2

    :try_start_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    const-string v6, "onMenuKeyEvent"

    const-class v7, Landroid/view/KeyEvent;

    filled-new-array {v7}, [Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    sput-object v5, LZ0/d;->b:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    sput-boolean v1, LZ0/d;->a:Z

    :cond_2
    sget-object v5, LZ0/d;->b:Ljava/lang/reflect/Method;

    if-eqz v5, :cond_3

    :try_start_1
    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v3, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_4

    :catch_1
    :cond_3
    move v3, v4

    goto :goto_0

    :cond_4
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_0
    if-eqz v3, :cond_5

    goto/16 :goto_8

    :cond_5
    invoke-virtual {v0, p1}, Landroid/view/Window;->superDispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v3

    if-eqz v3, :cond_6

    goto/16 :goto_8

    :cond_6
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    sget-object v3, Ld1/K;->a:Ljava/lang/reflect/Field;

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v5, 0x0

    if-lt v3, v2, :cond_7

    goto/16 :goto_7

    :cond_7
    sget-object v2, Ld1/J;->d:Ljava/util/ArrayList;

    const v2, 0x7f080195

    invoke-virtual {v0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ld1/J;

    if-nez v3, :cond_8

    new-instance v3, Ld1/J;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-object v5, v3, Ld1/J;->a:Ljava/util/WeakHashMap;

    iput-object v5, v3, Ld1/J;->b:Landroid/util/SparseArray;

    iput-object v5, v3, Ld1/J;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, v2, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_8
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v2

    if-nez v2, :cond_f

    iget-object v2, v3, Ld1/J;->a:Ljava/util/WeakHashMap;

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Ljava/util/WeakHashMap;->clear()V

    :cond_9
    sget-object v2, Ld1/J;->d:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_a

    goto :goto_6

    :cond_a
    monitor-enter v2

    :try_start_2
    iget-object v6, v3, Ld1/J;->a:Ljava/util/WeakHashMap;

    if-nez v6, :cond_b

    new-instance v6, Ljava/util/WeakHashMap;

    invoke-direct {v6}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v6, v3, Ld1/J;->a:Ljava/util/WeakHashMap;

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_5

    :cond_b
    :goto_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v6

    sub-int/2addr v6, v1

    :goto_2
    if-ltz v6, :cond_e

    sget-object v7, Ld1/J;->d:Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/ref/WeakReference;

    invoke-virtual {v8}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/view/View;

    if-nez v8, :cond_c

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_4

    :cond_c
    iget-object v7, v3, Ld1/J;->a:Ljava/util/WeakHashMap;

    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v7, v8, v9}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v7

    :goto_3
    instance-of v8, v7, Landroid/view/View;

    if-eqz v8, :cond_d

    iget-object v8, v3, Ld1/J;->a:Ljava/util/WeakHashMap;

    move-object v9, v7

    check-cast v9, Landroid/view/View;

    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v8, v9, v10}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v7}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v7

    goto :goto_3

    :cond_d
    :goto_4
    add-int/lit8 v6, v6, -0x1

    goto :goto_2

    :cond_e
    monitor-exit v2

    goto :goto_6

    :goto_5
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :cond_f
    :goto_6
    invoke-virtual {v3, v0}, Ld1/J;->a(Landroid/view/View;)Landroid/view/View;

    move-result-object v2

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v6

    if-nez v6, :cond_11

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v6

    if-eqz v2, :cond_11

    invoke-static {v6}, Landroid/view/KeyEvent;->isModifierKey(I)Z

    move-result v7

    if-nez v7, :cond_11

    iget-object v7, v3, Ld1/J;->b:Landroid/util/SparseArray;

    if-nez v7, :cond_10

    new-instance v7, Landroid/util/SparseArray;

    invoke-direct {v7}, Landroid/util/SparseArray;-><init>()V

    iput-object v7, v3, Ld1/J;->b:Landroid/util/SparseArray;

    :cond_10
    iget-object v3, v3, Ld1/J;->b:Landroid/util/SparseArray;

    new-instance v7, Ljava/lang/ref/WeakReference;

    invoke-direct {v7, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v3, v6, v7}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_11
    if-eqz v2, :cond_12

    move v4, v1

    :cond_12
    :goto_7
    if-eqz v4, :cond_13

    goto :goto_8

    :cond_13
    if-eqz v0, :cond_14

    invoke-virtual {v0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    move-result-object v5

    :cond_14
    invoke-virtual {p1, p0, v5, p0}, Landroid/view/KeyEvent;->dispatch(Landroid/view/KeyEvent$Callback;Landroid/view/KeyEvent$DispatcherState;Ljava/lang/Object;)Z

    move-result v1

    :goto_8
    return v1
.end method

.method public final dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const-string v1, "window.decorView"

    invoke-static {v0, v1}, Lp2/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, LZ0/d;->r(Landroid/view/View;Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    :goto_0
    return p1
.end method

.method public final e()Landroidx/lifecycle/I;
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lb/k;->i:Landroidx/lifecycle/I;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/i;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lb/i;->a:Landroidx/lifecycle/I;

    iput-object v0, p0, Lb/k;->i:Landroidx/lifecycle/I;

    :cond_0
    iget-object v0, p0, Lb/k;->i:Landroidx/lifecycle/I;

    if-nez v0, :cond_1

    new-instance v0, Landroidx/lifecycle/I;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/lifecycle/I;-><init>(I)V

    iput-object v0, p0, Lb/k;->i:Landroidx/lifecycle/I;

    :cond_1
    iget-object v0, p0, Lb/k;->i:Landroidx/lifecycle/I;

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Your activity is not yet attached to the Application instance. You can\'t request ViewModel before onCreate call."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final f()V
    .locals 3

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x7f0801be

    invoke-virtual {v0, v2, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x7f0801c1

    invoke-virtual {v0, v2, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x7f0801c0

    invoke-virtual {v0, v2, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x7f0801bf

    invoke-virtual {v0, v2, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x7f08014b

    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method

.method public final g(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    sget p1, Landroidx/lifecycle/D;->e:I

    invoke-static {p0}, Landroidx/lifecycle/E;->c(Landroid/app/Activity;)V

    return-void
.end method

.method public final h(Landroid/os/Bundle;)V
    .locals 3

    const-string v0, "outState"

    invoke-static {p1, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/lifecycle/m;->f:Landroidx/lifecycle/m;

    const-string v1, "setCurrentState"

    iget-object v2, p0, Lb/k;->d:Landroidx/lifecycle/t;

    invoke-virtual {v2, v1}, Landroidx/lifecycle/t;->c(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Landroidx/lifecycle/t;->e(Landroidx/lifecycle/m;)V

    invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lb/k;->m:Lb/f;

    invoke-virtual {v0, p1, p2, p3}, Lb/f;->a(IILandroid/content/Intent;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method public final onBackPressed()V
    .locals 3

    iget-object v0, p0, Lb/k;->j:Lb/r;

    if-nez v0, :cond_0

    new-instance v0, Lb/r;

    new-instance v1, LM1/h;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0}, LM1/h;-><init>(ILjava/lang/Object;)V

    invoke-direct {v0, v1}, Lb/r;-><init>(LM1/h;)V

    iput-object v0, p0, Lb/k;->j:Lb/r;

    new-instance v0, LA1/a;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p0}, LA1/a;-><init>(ILjava/lang/Object;)V

    iget-object v1, p0, Lb/k;->g:Landroidx/lifecycle/t;

    invoke-virtual {v1, v0}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/q;)V

    :cond_0
    iget-object v0, p0, Lb/k;->j:Lb/r;

    invoke-virtual {v0}, Lb/r;->a()V

    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    iget-object v0, p0, Lb/k;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La1/e;

    invoke-virtual {v1, p1}, La1/e;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    iget-object v0, p0, Lb/k;->h:LA1/f;

    iget-boolean v1, v0, LA1/f;->a:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, LA1/f;->c()V

    :cond_0
    iget-object v1, v0, LA1/f;->b:Ljava/lang/Object;

    invoke-interface {v1}, Landroidx/lifecycle/r;->c()Landroidx/lifecycle/t;

    move-result-object v1

    iget-object v2, v1, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    sget-object v3, Landroidx/lifecycle/m;->g:Landroidx/lifecycle/m;

    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v2

    if-gez v2, :cond_5

    iget-object v0, v0, LA1/f;->c:Ljava/lang/Object;

    check-cast v0, LA1/e;

    iget-boolean v1, v0, LA1/e;->a:Z

    if-eqz v1, :cond_4

    iget-boolean v1, v0, LA1/e;->b:Z

    if-nez v1, :cond_3

    if-eqz p1, :cond_1

    const-string v1, "androidx.lifecycle.BundlableSavedStateRegistry.key"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iput-object v1, v0, LA1/e;->d:Ljava/lang/Object;

    const/4 v1, 0x1

    iput-boolean v1, v0, LA1/e;->b:Z

    iget-object v0, p0, Lb/k;->e:Ld/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p0, v0, Ld/a;->b:Lb/k;

    iget-object v0, v0, Ld/a;->a:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb/e;

    invoke-virtual {v1}, Lb/e;->a()V

    goto :goto_1

    :cond_2
    invoke-virtual {p0, p1}, Lb/k;->g(Landroid/os/Bundle;)V

    sget p1, Landroidx/lifecycle/D;->e:I

    invoke-static {p0}, Landroidx/lifecycle/E;->c(Landroid/app/Activity;)V

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "SavedStateRegistry was already restored."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "You must call performAttach() before calling performRestore(Bundle)."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "performRestore cannot be called when owner is "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v1, Landroidx/lifecycle/t;->c:Landroidx/lifecycle/m;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 0

    if-nez p1, :cond_1

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    invoke-virtual {p0}, Landroid/app/Activity;->getMenuInflater()Landroid/view/MenuInflater;

    iget-object p1, p0, Lb/k;->f:LA/t;

    iget-object p1, p1, LA/t;->e:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p2, 0x0

    if-nez p1, :cond_2

    iget-object p1, p0, Lb/k;->f:LA/t;

    iget-object p1, p1, LA/t;->e:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    return p2

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :cond_2
    return p2
.end method

.method public final onMultiWindowModeChanged(Z)V
    .locals 3

    .line 1
    iget-boolean p1, p0, Lb/k;->s:Z

    if-eqz p1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object p1, p0, Lb/k;->q:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La1/e;

    .line 3
    new-instance v1, LX1/e;

    const/4 v2, 0x6

    .line 4
    invoke-direct {v1, v2}, LX1/e;-><init>(I)V

    .line 5
    invoke-virtual {v0, v1}, La1/e;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final onMultiWindowModeChanged(ZLandroid/content/res/Configuration;)V
    .locals 3

    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lb/k;->s:Z

    const/4 v0, 0x0

    .line 7
    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMultiWindowModeChanged(ZLandroid/content/res/Configuration;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    iput-boolean v0, p0, Lb/k;->s:Z

    .line 9
    iget-object p1, p0, Lb/k;->q:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La1/e;

    .line 10
    new-instance v1, LX1/e;

    .line 11
    const-string v2, "newConfig"

    invoke-static {p2, v2}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x6

    .line 12
    invoke-direct {v1, v2}, LX1/e;-><init>(I)V

    .line 13
    invoke-virtual {v0, v1}, La1/e;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    .line 14
    iput-boolean v0, p0, Lb/k;->s:Z

    .line 15
    throw p1
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    iget-object v0, p0, Lb/k;->p:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La1/e;

    invoke-virtual {v1, p1}, La1/e;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final onPanelClosed(ILandroid/view/Menu;)V
    .locals 2

    iget-object v0, p0, Lb/k;->f:LA/t;

    iget-object v0, v0, LA/t;->e:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onPanelClosed(ILandroid/view/Menu;)V

    return-void

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LA/a;->j(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final onPictureInPictureModeChanged(Z)V
    .locals 3

    .line 1
    iget-boolean p1, p0, Lb/k;->t:Z

    if-eqz p1, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object p1, p0, Lb/k;->r:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La1/e;

    .line 3
    new-instance v1, LX1/e;

    const/4 v2, 0x7

    .line 4
    invoke-direct {v1, v2}, LX1/e;-><init>(I)V

    .line 5
    invoke-virtual {v0, v1}, La1/e;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final onPictureInPictureModeChanged(ZLandroid/content/res/Configuration;)V
    .locals 3

    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lb/k;->t:Z

    const/4 v0, 0x0

    .line 7
    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onPictureInPictureModeChanged(ZLandroid/content/res/Configuration;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    iput-boolean v0, p0, Lb/k;->t:Z

    .line 9
    iget-object p1, p0, Lb/k;->r:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La1/e;

    .line 10
    new-instance v1, LX1/e;

    .line 11
    const-string v2, "newConfig"

    invoke-static {p2, v2}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x7

    .line 12
    invoke-direct {v1, v2}, LX1/e;-><init>(I)V

    .line 13
    invoke-virtual {v0, v1}, La1/e;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    .line 14
    iput-boolean v0, p0, Lb/k;->t:Z

    .line 15
    throw p1
.end method

.method public final onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 0

    if-nez p1, :cond_1

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    iget-object p1, p0, Lb/k;->f:LA/t;

    iget-object p1, p1, LA/t;->e:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "androidx.activity.result.contract.extra.PERMISSIONS"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"

    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[I)Landroid/content/Intent;

    move-result-object v0

    const/4 v1, -0x1

    iget-object v2, p0, Lb/k;->m:Lb/f;

    invoke-virtual {v2, p1, v1, v0}, Lb/f;->a(IILandroid/content/Intent;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    :cond_0
    return-void
.end method

.method public final onRetainNonConfigurationInstance()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lb/k;->i:Landroidx/lifecycle/I;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb/i;

    if-eqz v1, :cond_0

    iget-object v0, v1, Lb/i;->a:Landroidx/lifecycle/I;

    :cond_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    new-instance v1, Lb/i;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v0, v1, Lb/i;->a:Landroidx/lifecycle/I;

    return-object v1
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 4

    iget-object v0, p0, Lb/k;->g:Landroidx/lifecycle/t;

    if-eqz v0, :cond_0

    sget-object v1, Landroidx/lifecycle/m;->f:Landroidx/lifecycle/m;

    const-string v2, "setCurrentState"

    invoke-virtual {v0, v2}, Landroidx/lifecycle/t;->c(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->e(Landroidx/lifecycle/m;)V

    :cond_0
    invoke-virtual {p0, p1}, Lb/k;->h(Landroid/os/Bundle;)V

    iget-object v0, p0, Lb/k;->h:LA1/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "outBundle"

    invoke-static {p1, v1}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, LA1/f;->c:Ljava/lang/Object;

    check-cast v0, LA1/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iget-object v2, v0, LA1/e;->d:Ljava/lang/Object;

    check-cast v2, Landroid/os/Bundle;

    if-eqz v2, :cond_1

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_1
    iget-object v0, v0, LA1/e;->c:Ljava/lang/Object;

    check-cast v0, Lm/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lm/d;

    invoke-direct {v2, v0}, Lm/d;-><init>(Lm/f;)V

    iget-object v0, v0, Lm/f;->f:Ljava/util/WeakHashMap;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v2, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    invoke-virtual {v2}, Lm/d;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v2}, Lm/d;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LA1/d;

    invoke-interface {v0}, LA1/d;->a()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v1, v3, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "androidx.lifecycle.BundlableSavedStateRegistry.key"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_3
    return-void
.end method

.method public final onTrimMemory(I)V
    .locals 3

    invoke-super {p0, p1}, Landroid/app/Activity;->onTrimMemory(I)V

    iget-object v0, p0, Lb/k;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La1/e;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, La1/e;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final reportFullyDrawn()V
    .locals 4

    :try_start_0
    invoke-static {}, La/a;->P()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "reportFullyDrawn() for ComponentActivity"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_0
    :goto_0
    invoke-super {p0}, Landroid/app/Activity;->reportFullyDrawn()V

    iget-object v0, p0, Lb/k;->l:LA1/f;

    iget-object v1, v0, LA1/f;->b:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x1

    :try_start_1
    iput-boolean v2, v0, LA1/f;->a:Z

    iget-object v2, v0, LA1/f;->c:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo2/a;

    invoke-interface {v3}, Lo2/a;->c()Ljava/lang/Object;

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_2

    :cond_1
    iget-object v0, v0, LA1/f;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :goto_2
    :try_start_3
    monitor-exit v1

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0
.end method

.method public final setContentView(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lb/k;->f()V

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lb/k;->k:Lb/j;

    invoke-virtual {v1, v0}, Lb/j;->a(Landroid/view/View;)V

    .line 3
    invoke-super {p0, p1}, Landroid/app/Activity;->setContentView(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness",
                "MissingNullability"
            }
        .end annotation
    .end param

    .line 4
    invoke-virtual {p0}, Lb/k;->f()V

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lb/k;->k:Lb/j;

    invoke-virtual {v1, v0}, Lb/j;->a(Landroid/view/View;)V

    .line 6
    invoke-super {p0, p1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    return-void
.end method

.method public final setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .line 7
    invoke-virtual {p0}, Lb/k;->f()V

    .line 8
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lb/k;->k:Lb/j;

    invoke-virtual {v1, v0}, Lb/j;->a(Landroid/view/View;)V

    .line 9
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method
