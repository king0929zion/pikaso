.class public abstract LC/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lv/d;

.field public static final b:Lv/d;

.field public static final c:Lv/d;

.field public static final d:Lv/d;

.field public static final e:Lv/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide/high16 v0, 0x403c000000000000L    # 28.0

    double-to-float v0, v0

    invoke-static {v0}, Lv/e;->a(F)Lv/d;

    move-result-object v0

    sput-object v0, LC/f;->a:Lv/d;

    const-wide/high16 v0, 0x4010000000000000L    # 4.0

    double-to-float v0, v0

    invoke-static {v0}, Lv/e;->a(F)Lv/d;

    move-result-object v0

    sput-object v0, LC/f;->b:Lv/d;

    const-wide/high16 v0, 0x4030000000000000L    # 16.0

    double-to-float v0, v0

    invoke-static {v0}, Lv/e;->a(F)Lv/d;

    move-result-object v0

    sput-object v0, LC/f;->c:Lv/d;

    const-wide/high16 v0, 0x4028000000000000L    # 12.0

    double-to-float v0, v0

    invoke-static {v0}, Lv/e;->a(F)Lv/d;

    move-result-object v0

    sput-object v0, LC/f;->d:Lv/d;

    const-wide/high16 v0, 0x4020000000000000L    # 8.0

    double-to-float v0, v0

    invoke-static {v0}, Lv/e;->a(F)Lv/d;

    move-result-object v0

    sput-object v0, LC/f;->e:Lv/d;

    return-void
.end method
