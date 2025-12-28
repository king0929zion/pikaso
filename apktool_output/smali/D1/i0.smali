.class public final Ld1/i0;
.super Ld1/h0;
.source "SourceFile"


# static fields
.field public static final q:Ld1/l0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, LG1/i;->i()Landroid/view/WindowInsets;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ld1/l0;->d(Landroid/view/View;Landroid/view/WindowInsets;)Ld1/l0;

    move-result-object v0

    sput-object v0, Ld1/i0;->q:Ld1/l0;

    return-void
.end method

.method public constructor <init>(Ld1/l0;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ld1/h0;-><init>(Ld1/l0;Landroid/view/WindowInsets;)V

    return-void
.end method


# virtual methods
.method public final d(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public f(I)LV0/c;
    .locals 1

    iget-object v0, p0, Ld1/e0;->c:Landroid/view/WindowInsets;

    invoke-static {p1}, Ld1/k0;->a(I)I

    move-result p1

    invoke-static {v0, p1}, LG1/i;->f(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {p1}, LV0/c;->c(Landroid/graphics/Insets;)LV0/c;

    move-result-object p1

    return-object p1
.end method
