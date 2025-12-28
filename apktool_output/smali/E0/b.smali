.class public final LE0/b;
.super Landroid/text/style/CharacterStyle;
.source "SourceFile"

# interfaces
.implements Landroid/text/style/UpdateAppearance;


# instance fields
.field public final a:LW/n;

.field public final b:F

.field public final c:LD/f0;

.field public final d:LD/D;


# direct methods
.method public constructor <init>(LW/n;F)V
    .locals 2

    invoke-direct {p0}, Landroid/text/style/CharacterStyle;-><init>()V

    iput-object p1, p0, LE0/b;->a:LW/n;

    iput p2, p0, LE0/b;->b:F

    new-instance p1, LV/f;

    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    invoke-direct {p1, v0, v1}, LV/f;-><init>(J)V

    invoke-static {p1}, LD/d;->A(Ljava/lang/Object;)LD/f0;

    move-result-object p1

    iput-object p1, p0, LE0/b;->c:LD/f0;

    new-instance p1, LA0/c;

    const/4 p2, 0x5

    invoke-direct {p1, p2, p0}, LA0/c;-><init>(ILjava/lang/Object;)V

    sget-object p2, LD/I0;->a:LB0/a;

    new-instance p2, LD/D;

    invoke-direct {p2, p1}, LD/D;-><init>(Lo2/a;)V

    iput-object p2, p0, LE0/b;->d:LD/D;

    return-void
.end method


# virtual methods
.method public final updateDrawState(Landroid/text/TextPaint;)V
    .locals 1

    iget v0, p0, LE0/b;->b:F

    invoke-static {p1, v0}, LC0/j;->b(Landroid/text/TextPaint;F)V

    iget-object v0, p0, LE0/b;->d:LD/D;

    invoke-virtual {v0}, LD/D;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Shader;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    return-void
.end method
