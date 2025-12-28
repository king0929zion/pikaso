.class public final LR/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LR/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LR/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LR/c;->a:LR/c;

    return-void
.end method

.method public static a(LR/e;Landroid/util/LongSparseArray;)V
    .locals 5

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Landroid/util/LongSparseArray;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    add-int/lit8 v1, v0, 0x1

    invoke-virtual {p1, v0}, Landroid/util/LongSparseArray;->keyAt(I)J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LM1/a;->m(Ljava/lang/Object;)Landroid/view/translation/ViewTranslationResponse;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, LM1/a;->j(Landroid/view/translation/ViewTranslationResponse;)Landroid/view/translation/TranslationResponseValue;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, LM1/a;->n(Landroid/view/translation/TranslationResponseValue;)Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LR/e;->g()Ln/r;

    move-result-object v4

    long-to-int v2, v2

    invoke-virtual {v4, v2}, Ln/r;->f(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo0/B0;

    if-eqz v2, :cond_1

    iget-object v2, v2, Lo0/B0;->a:Lt0/k;

    if-eqz v2, :cond_1

    sget-object v3, Lt0/f;->i:Lt0/q;

    iget-object v2, v2, Lt0/k;->d:Lt0/g;

    iget-object v2, v2, Lt0/g;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move-object v2, v3

    :cond_0
    check-cast v2, Lt0/a;

    if-eqz v2, :cond_1

    iget-object v2, v2, Lt0/a;->b:Lc2/c;

    check-cast v2, Lo2/c;

    if-eqz v2, :cond_1

    new-instance v4, Lv0/c;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0, v3, v3, v3}, Lv0/c;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    invoke-interface {v2, v4}, Lo2/c;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    :cond_1
    move v0, v1

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method public final b(LR/e;[J[ILjava/util/function/Consumer;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LR/e;",
            "[J[I",
            "Ljava/util/function/Consumer<",
            "Landroid/view/translation/ViewTranslationRequest;",
            ">;)V"
        }
    .end annotation

    array-length p3, p2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_2

    aget-wide v1, p2, v0

    invoke-virtual {p1}, LR/e;->g()Ln/r;

    move-result-object v3

    long-to-int v1, v1

    invoke-virtual {v3, v1}, Ln/r;->f(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo0/B0;

    if-eqz v1, :cond_1

    iget-object v1, v1, Lo0/B0;->a:Lt0/k;

    if-eqz v1, :cond_1

    invoke-static {}, LM1/a;->o()V

    iget-object v2, p1, LR/e;->d:Lo0/u;

    invoke-virtual {v2}, Landroid/view/View;->getAutofillId()Landroid/view/autofill/AutofillId;

    move-result-object v2

    iget v3, v1, Lt0/k;->g:I

    int-to-long v3, v3

    invoke-static {v2, v3, v4}, LM1/a;->k(Landroid/view/autofill/AutofillId;J)Landroid/view/translation/ViewTranslationRequest$Builder;

    move-result-object v2

    sget-object v3, Lt0/n;->s:Lt0/q;

    iget-object v1, v1, Lt0/k;->d:Lt0/g;

    iget-object v1, v1, Lt0/g;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    move-object v1, v3

    :cond_0
    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_1

    const-string v4, "\n"

    invoke-static {v1, v4}, La/a;->A(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    new-instance v4, Lv0/c;

    invoke-direct {v4, v1, v3, v3, v3}, Lv0/c;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    invoke-static {v4}, LM1/a;->i(Lv0/c;)Landroid/view/translation/TranslationRequestValue;

    move-result-object v1

    invoke-static {v2, v1}, LM1/a;->y(Landroid/view/translation/ViewTranslationRequest$Builder;Landroid/view/translation/TranslationRequestValue;)V

    invoke-static {v2}, LM1/a;->l(Landroid/view/translation/ViewTranslationRequest$Builder;)Landroid/view/translation/ViewTranslationRequest;

    move-result-object v1

    invoke-interface {p4, v1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final c(LR/e;Landroid/util/LongSparseArray;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LR/e;",
            "Landroid/util/LongSparseArray<",
            "Landroid/view/translation/ViewTranslationResponse;",
            ">;)V"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-ge v0, v1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-static {v0, v1}, Lp2/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1, p2}, LR/c;->a(LR/e;Landroid/util/LongSparseArray;)V

    goto :goto_0

    :cond_1
    iget-object v0, p1, LR/e;->d:Lo0/u;

    new-instance v1, LR/b;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2, p2}, LR/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void
.end method
